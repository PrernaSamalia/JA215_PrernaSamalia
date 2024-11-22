package com.hexaware.cricketteammanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hexaware.cricketteammanagement.service")
public class CricketTeamManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketTeamManagementSystemApplication.class, args);
	}

}
