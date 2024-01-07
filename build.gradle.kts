plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.kotlin.plugin.junit") version "1.6.10"
    id("org.owasp.dependencycheck") version "6.3.2"
}

dependencyCheck {
    format = 'HTML'
    outputDirectory = file("$buildDir/dependency-check")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
