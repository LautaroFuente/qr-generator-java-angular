package com.qr_backend.qr_backend_core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qr_backend.qr_backend_core.entities.QrInfo;
import com.qr_backend.qr_backend_core.repository.QrInfoRepository;

@Service
public class QrInfoService {

	@Autowired
	private QrInfoRepository qrinforepository;
	
	public List<QrInfo> getAllQr(){
		return qrinforepository.findAll();
	}
	
	public void saveQr(QrInfo qrinfo){
		qrinforepository.save(qrinfo);
	}
}
