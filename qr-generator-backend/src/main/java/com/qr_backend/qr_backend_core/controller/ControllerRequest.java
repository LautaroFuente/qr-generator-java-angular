package com.qr_backend.qr_backend_core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qr_backend.qr_backend_core.model.QrInfo;

@RestController
@RequestMapping("/api")
public class ControllerRequest {
	
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping("/data")
	    public ResponseEntity<String> getData() {

	        return ResponseEntity.ok("Datos obtenidos correctamente");
	    }

	 
	 	@CrossOrigin(origins = "http://localhost:4200")
	    @PostMapping("/data")
	    public ResponseEntity<String> postData(@RequestBody QrInfo qrinfo) {

	 		System.out.println("Datos");
	        //return ResponseEntity.ok("Datos recibidos: " + qrinfo.getNombre() + " " + qrinfo.getEmail() + " " + qrinfo.getDate() );
	 		return ResponseEntity.ok("Datos obtenidos correctamente");
	    }
	
}
