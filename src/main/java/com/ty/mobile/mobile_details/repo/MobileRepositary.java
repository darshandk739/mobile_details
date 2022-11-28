package com.ty.mobile.mobile_details.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.mobile.mobile_details.dto.Mobile;

public interface MobileRepositary extends JpaRepository<Mobile, Integer> {

}
