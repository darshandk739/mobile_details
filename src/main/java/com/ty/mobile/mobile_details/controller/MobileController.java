package com.ty.mobile.mobile_details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.mobile.mobile_details.dao.MobileDao;
import com.ty.mobile.mobile_details.dto.Mobile;


@RestController
public class MobileController {

	

	@Autowired
	MobileDao dao;
	
	@PostMapping("savemobile")
	public Mobile saveMobile(@RequestBody Mobile mobile) {
		return dao.saveMobile(mobile);
	}
	
	@GetMapping("getmobile")
	public Mobile getMobile(@RequestParam int id)
	{
		return dao.getMobile(id);
		
	}
	
	@DeleteMapping("deletemobile/{id}")
	public String deleteMobile(@PathVariable int id)
	{
		return dao.deleteMobile(id);
	}
}
