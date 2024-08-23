plugins {
  id("java")
  id("maven-publish")
  id("com.github.johnrengelman.shadow") version "8.1.1" apply false
}

allprojects {
  group = "me.kvdpxne"
  version = "0.1.0"
}

subprojects {

  apply {
    plugin("java")
    plugin("maven-publish")
    plugin("com.github.johnrengelman.shadow")
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