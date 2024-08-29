package com.qr_backend.qr_backend_core.model;

import java.util.Date;

public class QrInfo {

	private String nombre;
	private String email;
	private Date date;
	
	public QrInfo(String nombre, String email, Date date) {
		this.nombre = nombre;
		this.email = email;
		this.date = date;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public Date getDate() {
		return date;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
