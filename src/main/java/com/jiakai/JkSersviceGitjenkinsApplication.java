package com.jiakai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JkSersviceGitjenkinsApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JkSersviceGitjenkinsApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JkSersviceGitjenkinsApplication.class, args);
	}

}


