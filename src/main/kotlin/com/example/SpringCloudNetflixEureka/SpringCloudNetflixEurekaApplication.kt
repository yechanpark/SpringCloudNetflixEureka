package com.example.SpringCloudNetflixEureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringCloudNetflixEurekaApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudNetflixEurekaApplication>(*args)
}
