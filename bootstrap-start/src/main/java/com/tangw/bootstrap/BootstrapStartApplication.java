package com.tangw.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.tangw.bootstrap")
public class BootstrapStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapStartApplication.class, args);
	}

}
