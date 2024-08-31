package com.qr_backend.qr_backend_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QrBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(QrBackendApplication.class, args);
		System.out.println("OK");
	}

}
