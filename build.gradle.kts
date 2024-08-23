plugins {
  id("java")
  id("maven-publish")
  id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "me.kvdpxne"
version = "0.1.0"

subprojects {

  apply(plugin = "java")
  apply(plugin = "com.github.johnrengelman.shadow")

  group = "me.kvdpxne"
  version = "0.1.0"

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

publishing {
  publications {

    register("mavenJava", MavenPublication::class) {
      groupId = "me.kvdpxne"
      artifactId = "dico"
      version = "0.1.0"

      from(components["java"])
    }
  }
}

tasks {

  wrapper {
    distributionType = Wrapper.DistributionType.ALL
  }
}