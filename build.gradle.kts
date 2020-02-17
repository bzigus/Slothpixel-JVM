/*plugins {
    java
    scala
    kotlin("jvm") version "1.3.61"
}

group = "zone.nora"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.google.code.gson", "gson", "2.8.5")

    testCompile("org.scala-lang", "scala-library", "2.13.1")
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

// https://stackoverflow.com/questions/41794914/
val fatJar = task("fatJar", type = Jar::class) {
    baseName = "Slothpixel-full"
    from(configurations.runtimeClasspath.get().map({ if (it.isDirectory) it else zipTree(it) }))
    with(tasks.jar.get() as CopySpec)
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    "build" {
        dependsOn(fatJar)
    }
}*/