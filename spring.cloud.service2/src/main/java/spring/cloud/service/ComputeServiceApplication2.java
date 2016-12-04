package spring.cloud.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication2 {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceApplication2.class).web(true).run(args);
	}
}
