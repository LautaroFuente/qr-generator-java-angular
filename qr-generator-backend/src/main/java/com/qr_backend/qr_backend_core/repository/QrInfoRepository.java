package com.qr_backend.qr_backend_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qr_backend.qr_backend_core.entities.QrInfo;

public interface QrInfoRepository extends JpaRepository<QrInfo, Long>{

}
