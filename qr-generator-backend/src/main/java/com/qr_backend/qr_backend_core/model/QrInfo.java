package com.qr_backend.qr_backend_core.model;

import java.util.Date;

public class QrInfo {

	private String name;
	private String email;
	private Date date;
	
	public QrInfo(String name, String email, Date date) {
		this.name = name;
		this.email = email;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getDate() {
		return date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
