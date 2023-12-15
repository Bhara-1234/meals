package com.mymeal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mymeal" })
public class MymealApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymealApplication.class, args);
	}

}
