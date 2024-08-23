pluginManagement {

  repositories {
    gradlePluginPortal()

    mavenCentral()
    mavenLocal()
  }
}

dependencyResolutionManagement {

  repositories {
    mavenCentral()
    mavenLocal()

    maven {
      url = uri("https://jitpack.io/")
      content {
        includeGroupAndSubgroups("com.github.kvdpxne")
      }
    }
  }
}

include(
  ":core",
  ":versioning:api",
  ":versioning:v1_7_R1",
  ":versioning:v1_8_R1",
)

rootProject.name = "dico"

