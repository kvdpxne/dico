plugins {
  id("java")
}

group = "me.kvdpxne"
version = "1.0-SNAPSHOT"

subprojects {

  apply(plugin = "java")

  group = "me.kvdpxne"
  version = "1.0-SNAPSHOT"

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