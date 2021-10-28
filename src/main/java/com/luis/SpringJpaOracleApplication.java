package com.luis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.luis.repository")
@SpringBootApplication
public class SpringJpaOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOracleApplication.class, args);
	}

}
