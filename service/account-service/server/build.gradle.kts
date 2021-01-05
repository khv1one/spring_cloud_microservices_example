import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version Version.kotlinVersion
	kotlin("plugin.spring") version Version.kotlinVersion
}

version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = Version.javaVersion

dependencies {
    commonKotlinDependencies()
    clientDependencies()
    withTestImpl()
}

dependencyManagement {
	imports {
		mavenBom(Package.springCloudDependencies)
        mavenBom(Package.springBootDependencies) {
            bomProperty("kotlin.version", Version.kotlinVersion)
        }
	}
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = CompileSettings.commonCompileArgs
		jvmTarget = Version.jvmTarget
	}
}
