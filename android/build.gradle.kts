allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// Garante que o projeto `:app` seja avaliado antes dos demais
subprojects {
    project.evaluationDependsOn(":app")
}

// Task de limpeza do projeto
tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
