plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
    maven {
        credentials {
            username = "${project.properties["mavenUsername"]}"
            password = "${project.properties["mavenPassword"]}"
        }
        url = uri("http://nexus.smartnews.be/nexus/content/repositories/smartnews")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.71")
}
