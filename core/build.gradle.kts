dependencies {
  implementation(files("../libraries/craftbukkit-1.7.2-R1.jar"))
  implementation(project(":versioning:api"))
  implementation(project(":versioning:v1_7_R1"))
  implementation(project(":versioning:v1_8_R1"))

  implementation("com.github.kvdpxne:notchity:ef154a8e62")
}