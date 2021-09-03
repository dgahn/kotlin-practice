plugins {
    kotlin("jvm") version "1.5.30"
}

group = "me.dgahn"
version = "0.0.1"

apply(plugin = "kotlin")

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")

    testImplementation("io.kotest:kotest-assertions-core:4.6.1")
    testImplementation("io.kotest:kotest-runner-junit5:4.6.1")

}
