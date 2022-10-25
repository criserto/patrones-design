package com.patrones;

import com.patrones.singleton.PersonSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronesDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDesignApplication.class, args);

		//CRISTIAN GONZÁLEZ HENS
		//PATRON SINGLETON
		PersonSingleton personSingleton = new PersonSingleton("Cristian", 30, "programador");
		System.out.println(personSingleton.hablar());
		System.out.println(personSingleton.decirFuncion());
	}

}
