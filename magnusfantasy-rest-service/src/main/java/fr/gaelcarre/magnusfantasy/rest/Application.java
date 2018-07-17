package fr.gaelcarre.magnusfantasy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import fr.gaelcarre.magnusfantasy.rest.controller.InitController;

@SpringBootApplication
@ComponentScan("fr.gaelcarre.*")
public class Application {

	@Autowired
	private static InitController initController;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
