package com.ganzymalgwi.githubcicdaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class GithubCicdActionApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to CI/CD";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}

}
