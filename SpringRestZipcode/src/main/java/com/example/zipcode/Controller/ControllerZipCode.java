package com.example.zipcode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.zipcode.Entity.Zipcode;
import com.example.zipcode.Service.ServicePin;

@RestController
public class ControllerZipCode {
	
	@Autowired
	ServicePin s;

	@GetMapping("/find/{pincode}")
	public Zipcode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return s.getDetails(pincode);	
	}
}
