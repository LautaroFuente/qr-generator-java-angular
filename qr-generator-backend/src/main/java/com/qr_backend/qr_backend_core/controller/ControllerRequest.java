package com.qr_backend.qr_backend_core.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerRequest {
	
	 @GetMapping("/data")
	    public ResponseEntity<String> getData() {

	        return ResponseEntity.ok("Datos obtenidos correctamente");
	    }


	    @PostMapping("/data")
	    public ResponseEntity<String> postData(@RequestBody String requestBody) {

	        return ResponseEntity.ok("Datos recibidos: " + requestBody);
	    }
	
}
