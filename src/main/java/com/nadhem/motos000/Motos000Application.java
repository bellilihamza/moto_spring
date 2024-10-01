package com.nadhem.motos000;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Motos000Application {

	public static void main(String[] args) {
		SpringApplication.run(Motos000Application.class, args);
	}
	   @Bean
	    public ModelMapper modelMapper() {
	        return new ModelMapper();
	    }

}
