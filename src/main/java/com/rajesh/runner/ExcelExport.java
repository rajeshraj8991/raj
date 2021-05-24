package com.rajesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("default")
public class ExcelExport implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("if no profiles is active!...");
	}

}
