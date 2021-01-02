package example.microsevices.serviceregistryserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceRegistryServerApplication

fun main(args: Array<String>) {
	runApplication<ServiceRegistryServerApplication>(*args)
}
