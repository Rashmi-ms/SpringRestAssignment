package com.example.zipcode.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.zipcode.Entity.Zipcode;
@Service
public class ServiceZipcode implements ServicePin {
	
	List<Zipcode> pin;

	public ServiceZipcode() {
		pin = new ArrayList<>();
		pin.add(new Zipcode(263149,"UK","Jawahar Nagar","India"));
		pin.add(new Zipcode(263145,"UK","Pantnagar","India"));
		pin.add(new Zipcode(263139,"UK","Haldwani","India"));
		pin.add(new Zipcode(263666,"UK","Haridwar","India"));
		pin.add(new Zipcode(263108,"UK","Dehradun","India"));
		pin.add(new Zipcode(110049,"Delhi","Karol Bagh","India"));
		pin.add(new Zipcode(110069,"Delhi","Patel Nagar","India"));
		pin.add(new Zipcode(113149,"MH","Pune","India"));
		pin.add(new Zipcode(269949,"RJ","Jaipur","India"));
		pin.add(new Zipcode(999149,"MP","Bhopal","India"));
		pin.add(new Zipcode(163149,"PB","Ludhiyana","India"));		
	}
	
	public Zipcode getDetails(int pincode) {
		for(Zipcode p : pin)
			{
			if(p.getPin()==pincode)
				{
				System.out.println(p);
			    return p;
			    }
			}
		return null;
		
	}
	
	
	

}
