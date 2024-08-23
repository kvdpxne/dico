plugins {
  id("java")
  id("maven-publish")

  alias(libraries.plugins.shadow)
}

allprojects {
  group = "me.kvdpxne"
  version = "0.1.0"
}

subprojects {

  apply {
    plugin("java")
    plugin("maven-publish")
    plugin("com.gradleup.shadow")
  }

  val targetJavaVersion = 21

  java {
    val javaVersion = JavaVersion.toVersion(targetJavaVersion)

    sourceCompatibility = javaVersion
    targetCompatibility = javaVersion

    if (JavaVersion.current() < javaVersion) {
      toolchain.languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    }
  }

  afterEvaluate {

    publishing {
      publications {
        register("mavenJava", MavenPublication::class) {
          from(components["java"])
        }
      }
    }
  }

  tasks {

    withType<JavaCompile> {
      if (10 <= targetJavaVersion || JavaVersion.current().isJava10Compatible) {
        options.release.set(targetJavaVersion)
      }
    }

    withType<Test> {
      useJUnitPlatform()
    }
  }
}

tasks {

  wrapper {
    distributionType = Wrapper.DistributionType.ALL
  }
}