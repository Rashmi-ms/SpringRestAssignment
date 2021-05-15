package com.example.zipcode.Service;

import org.springframework.stereotype.Service;

import com.example.zipcode.Entity.Zipcode;

@Service
public interface ServicePin {

	public Zipcode getDetails(int pincode);

}
