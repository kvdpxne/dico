dependencies {
  compileOnly(libraries.spigot.legacy)

  api(project(":versioning-common"))
  api(project(":versioning-v1_7_R1"))
  api(project(":versioning-v1_8_R1"))

  api(libraries.notchity)
}