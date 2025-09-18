package com.qr_backend.qr_backend_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class QrBackendApplication {

	public static void main(String[] args) {
		//Dotenv dotenv = Dotenv.load();
        //System.setProperty("DB_URL", dotenv.get("DB_URL"));
        //System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
        //System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));
		
		SpringApplication.run(QrBackendApplication.class, args);
		System.out.println("Aplicacion BackEnd Funcionando");
	}

}
