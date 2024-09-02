package com.qr_backend.qr_backend_core.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	    public ResponseEntity<List<QrInfo>> getData() {

			QrInfo qr1 = new QrInfo("hola1", "hola1@gmail", new Date());
			QrInfo qr2 = new QrInfo("hola2", "hola2@gmail", new Date());
			ArrayList<QrInfo> list = new ArrayList<QrInfo>();
			list.add(qr1);
			list.add(qr2);
			
	        return ResponseEntity.ok(list);
	    }

	 
	 	@CrossOrigin(origins = "http://localhost:4200")
	    @PostMapping("/data")
	    public ResponseEntity<QrInfo> postData(@RequestBody QrInfo qrinfo) {

	 		System.out.println("Datos recibidos: " + qrinfo.getName() + " " + qrinfo.getEmail() + " " + qrinfo.getDate());
	        return ResponseEntity.ok(qrinfo );
	    }
	
}
