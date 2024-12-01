dependencies {
  compileOnly(libraries.spigot.legacy)

  shadow(project(":versioning:common"))
  shadow(project(":versioning:v1_7_R1"))
  shadow(project(":versioning:v1_8_R1"))

  shadow(libraries.notchity)
}