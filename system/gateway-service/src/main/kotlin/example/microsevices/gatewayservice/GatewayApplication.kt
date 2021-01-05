package example.microsevices.gatewayservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class ServiceRegistryServerApplication

fun main(args: Array<String>) {
	runApplication<ServiceRegistryServerApplication>(*args)
}
