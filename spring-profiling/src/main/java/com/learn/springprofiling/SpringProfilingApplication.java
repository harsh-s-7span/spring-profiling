package com.learn.springprofiling;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfilingApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringProfilingApplication.class, args);
	}

	@Value("${my.designation}")
	private String designation;

	@Value("${my.profile}")
	private String profile;

	@Value("${my.onlyOne}")
	private String onlyOne;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Designation : " + designation);
		System.out.println("Profile : " + profile);
		System.out.println("Not replaced by other profile : " + onlyOne);
	}
}
