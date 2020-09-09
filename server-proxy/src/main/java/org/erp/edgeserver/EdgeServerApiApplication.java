package org.erp.edgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EdgeServerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServerApiApplication.class, args);
	}

}
