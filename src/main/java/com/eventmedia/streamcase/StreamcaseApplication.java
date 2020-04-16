package com.eventmedia.streamcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StreamcaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamcaseApplication.class, args);
	}

}
