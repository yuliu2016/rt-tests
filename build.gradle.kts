@file:Suppress("SpellCheckingInspection")

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(module = "jvm") version "1.3.21"
    id("application")
    id("com.github.johnrengelman.shadow") version "4.0.4"
    id("org.openjfx.javafxplugin") version "0.0.7"
}

val versionName = "2019.1.0-humber"
version = versionName

repositories {
    mavenCentral()
    jcenter()
    maven("http://dl.bintray.com/kyonifer/maven")
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"

val kotlinVersion = "1.3.21"

buildDir = File(rootProject.projectDir, "build/${project.name}")

javafx {
    modules = listOf(
        "javafx.controls",
        "javafx.fxml"
    )
}

dependencies {
    // Java libraries
    implementation(group = "commons-io", name = "commons-io", version = "2.6")
    implementation(group = "com.github.sarxos", name = "webcam-capture", version = "0.3.12")
    implementation(group = "com.google.zxing", name = "core", version = "3.3.3")
    implementation(group = "com.google.zxing", name = "javase", version = "3.3.3")
    implementation(group = "org.kordamp.ikonli", name = "ikonli-javafx", version = "11.1.0")
    implementation(group = "org.kordamp.ikonli", name = "ikonli-fontawesome5-pack", version = "11.1.0")
    implementation(group = "org.slf4j", name = "slf4j-simple", version = "1.7.6")
    implementation(group = "org.controlsfx", name = "controlsfx", version = "11.0.0-RC2")

    // Kotlin libraries
    implementation(kotlin("stdlib", kotlinVersion))
    implementation(kotlin("reflect", kotlinVersion))
    implementation(group = "de.mpicbg.scicomp", name = "krangl", version = "0.10.3")
    implementation(group = "com.beust", name = "klaxon", version = "3.0.1")
    implementation(group = "com.kyonifer", name = "koma-core-ejml", version = "0.12")
    implementation(group = "org.apache.commons", name = "commons-math3", version = "3.0")
    testImplementation(kotlin("test", kotlinVersion))
}

val mainClassName0 = "ca.warp7.rtest.Launcher"
application.mainClassName = mainClassName0