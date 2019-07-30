package com.wucc.springboot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class Springboot02Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot02Application.class, args);
	}

}
