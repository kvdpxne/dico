pluginManagement {

  repositories {
    gradlePluginPortal()

    mavenCentral()
    mavenLocal()
  }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {

  versionCatalogs {
    val fileName = "libraries"
    create(fileName) {
      from(files("gradle/$fileName.versions.toml"))
    }
  }

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

  repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}

include(
  ":core",
  ":versioning:api",
  ":versioning:v1_7_R1",
  ":versioning:v1_8_R1",
)

rootProject.name = "dico"

