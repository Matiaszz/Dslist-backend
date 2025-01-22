package dev.matias.dslist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.matias.utils.Utils;

@SpringBootApplication
public class DslistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DslistApplication.class, args);
		Utils.clearScreen();
		System.out.println("this is a test, ignore it");
	}

}
