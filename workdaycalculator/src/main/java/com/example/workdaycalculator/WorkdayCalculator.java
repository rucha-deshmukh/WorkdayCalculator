package com.example.workdaycalculator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class WorkdayCalculator {

	public static void main(String[] args) {
		SpringApplication.run(WorkdayCalculator.class, args);
		log.info("Swagger url: http://localhost:8080/swagger-ui/index.html");
		log.info("H2 url: http://localhost:8080/h2-console");
	}

}
