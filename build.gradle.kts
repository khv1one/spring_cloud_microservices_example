plugins {
    id(Package.springDependencyManagment) version Version.springDependencyManagementVersion
    id(Package.springBootPackage) version Version.springBootVersion
}

allprojects {
    group = Package.projectGroup

    repositories {
        mavenCentral()
        maven { url = uri(Version.mavenUrl) }
    }
}

subprojects {
    apply(plugin = Package.springDependencyManagment)
    apply(plugin = Package.springBootPackage)

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}