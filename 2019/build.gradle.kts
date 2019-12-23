import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.41"
}

group = "dangilbert.eu"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.locationtech.jts:jts-core:1.16.1")
    implementation("com.marcinmoskala:DiscreteMathToolkit:1.0.3")
    implementation("com.andreapivetta.kolor:kolor:0.0.2")
    testImplementation("junit:junit:4.12")
    testImplementation("com.google.truth:truth:1.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}