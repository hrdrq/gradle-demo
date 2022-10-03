package gradle.demo

import org.gradle.api.Project

fun Project.addFly() {
    tasks.register("fly") {
        println("${project.name} fly")
    }
}

fun Project.addJump() {
    tasks.register("jump") {
        println("${project.name} jump")
    }
}
