package com.MajorProject.AirBnB.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AirBnBAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirBnBAppApplication.class, args);
	}

}
