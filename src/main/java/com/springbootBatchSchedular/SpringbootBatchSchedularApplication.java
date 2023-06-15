package com.springbootBatchSchedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootBatchSchedularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBatchSchedularApplication.class, args);
	}

}
