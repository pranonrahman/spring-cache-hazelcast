package net.therap.hazelcastdemoquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HazelcastDemoQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HazelcastDemoQueryApplication.class, args);
	}

}
