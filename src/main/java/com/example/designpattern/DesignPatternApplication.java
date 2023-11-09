package com.example.designpattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.designpattern.memento.MementoPatternService;
import com.example.designpattern.state.StatePatternService;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			BaseServiceRunner runner1 = new MementoPatternService();
			runner1.run();

			System.out.println("===========================================================");
			
			BaseServiceRunner runner2 = new StatePatternService();
			runner2.run();
		};
	}
}
