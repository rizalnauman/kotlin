
plugins {
    kotlin("jvm")
    id("jps-compatible")
}

jvmDefaultMode = "disable"

dependencies {
    compile(project(":compiler:util"))
    compile(project(":compiler:frontend"))
    compileOnly(intellijCoreDep()) { includeJars("intellij-core") }
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}
