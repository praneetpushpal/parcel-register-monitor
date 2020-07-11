package com.monitor.parcel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monitor.parcel.model.ParcelInfo;

@Repository
public interface ParcelInfoRepository extends JpaRepository<ParcelInfo, Long> {

    Optional<ParcelInfo> findByTrackingId(String trackingId);
}
