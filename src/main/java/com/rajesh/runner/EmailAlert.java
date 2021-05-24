package com.rajesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component
@Data
//@Profile("prod")
@Profile({"prod","qa"})//env is qa or prod
public class EmailAlert implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("sending email...");

	}

}
