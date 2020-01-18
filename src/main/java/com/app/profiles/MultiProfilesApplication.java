package com.app.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;

@SpringBootApplication(exclude = ContextStackAutoConfiguration.class)
public class MultiProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.app.profiles.MultiProfilesApplication.class, args);
	}

}
