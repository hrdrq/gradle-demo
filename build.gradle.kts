allprojects {
    tasks.register("allprojectsTask") {
        println("${project.name} allprojectsTask")
    }
}
subprojects {
    tasks.register("subprojectsTask") {
        println("${project.name} subprojectsTask")
    }
}

gradle.rootProject {
    tasks.register("rootProjectTask") {
        println("${project.name} rootProjectTask")
    }
}
