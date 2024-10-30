dependencies {
  compileOnly(libraries.spigot.legacy)

  implementation(project(":versioning:common"))
  implementation(project(":versioning:v1_7_R1"))
  implementation(project(":versioning:v1_8_R1"))

  implementation(libraries.notchity)
}