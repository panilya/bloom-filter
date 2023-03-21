plugins {
    kotlin("jvm") version "1.8.10"
}

group = "com.panilya"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("commons-codec:commons-codec:1.15") // hash functions

    implementation("net.datafaker:datafaker:1.8.1")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
