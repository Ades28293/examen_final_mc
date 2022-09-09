package com.uce.edu.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamenFinalMcApplication implements CommandLineRunner{
	Logger LOGGER=Logger.getLogger(ExamenFinalMcApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalMcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola");
	}

}
