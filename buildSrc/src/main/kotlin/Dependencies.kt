
import org.gradle.api.JavaVersion
import org.gradle.kotlin.dsl.DependencyHandlerScope

object Version {
    val kotlinVersion = "1.4.21"
    val springBootVersion = "2.4.1"
    val springCloudVersion = "2020.0.0"
    val springDependencyManagementVersion = "1.0.10.RELEASE"
    val javaVersion = JavaVersion.VERSION_1_8
    val jvmTarget = "1.8"

    val mavenUrl = "https://repo.spring.io/milestone"
}

object Package {
    val projectGroup = "example.microservices"

    val springDependencyManagment = "io.spring.dependency-management"
    val springBootPackage = "org.springframework.boot"

    val springBootDependencies = "org.springframework.boot:spring-boot-dependencies:${Version.springBootVersion}"
    val springCloudDependencies = "org.springframework.cloud:spring-cloud-dependencies:${Version.springCloudVersion}"

    val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect"
    val kotlinJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"

    val springBootstrap = "org.springframework.cloud:spring-cloud-starter-bootstrap"
    val springConfigClient = "org.springframework.cloud:spring-cloud-starter-config"

    val springEurekaServer = "org.springframework.cloud:spring-cloud-starter-netflix-eureka-server"
}

object CompileSettings {
    val commonCompileArgs = listOf("-Xjsr305=strict")
}

fun DependencyHandlerScope.commonKotlinDependencies() {
    "implementation"(Package.kotlinReflect)
    "implementation"(Package.kotlinJdk8)
}

fun DependencyHandlerScope.commonSpringDependencies() {
    "implementation"(Package.springBootstrap)
    "implementation"(Package.springConfigClient)
}

fun DependencyHandlerScope.withTestImpl() = "testImplementation"("org.springframework.boot:spring-boot-starter-test")


