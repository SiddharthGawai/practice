package com.rel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsRelationalMappingCrudApplication {

	public static void main(String[] args) 
	{
		System.out.println("in relationalMapping");
		SpringApplication.run(WsRelationalMappingCrudApplication.class, args);
	}

}
