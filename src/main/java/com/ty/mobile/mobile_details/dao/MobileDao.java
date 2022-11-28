package com.ty.mobile.mobile_details.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.mobile.mobile_details.dto.Mobile;
import com.ty.mobile.mobile_details.repo.MobileRepositary;


@Repository
public class MobileDao {

	
	@Autowired
	MobileRepositary repositary;
	
	public Mobile saveMobile(Mobile mobile)
	{
		
		return repositary.save(mobile);
		
	}

	public Mobile getMobile(int id) {
		
		return repositary.findById(id).get();
	}
	
	public String deleteMobile(int id)
	{
		repositary.deleteById(id);
		return "deleted";
	}
}
