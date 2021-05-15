package com.example.user.login.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.login.entity.User;

@Service
public class ServiceUserImpl implements UserService {

	List<User> users;

	public ServiceUserImpl() {
		users = new ArrayList<>();
		users.add(new User("Naman", "pass"));
		users.add(new User("Nikita", "Password1234"));
		users.add(new User("Niharika", "Password013"));
		users.add(new User("Nairobi", "Password1023"));
		users.add(new User("Tokyo", "Password1203"));
		users.add(new User("Professor", "Password120"));
		users.add(new User("Shinchan", "Password123"));
		users.add(new User("Kavita", "Password12"));
	}

	@Override
	public String check(User u1) {
		for (User u : users)
			{
		  if(u.getUserName().matches(u1.getUserName()))
		  {
			  if(u.getPassword().matches(u1.getPassword())) 
					return  "Valid User"; 
		  }
			}
		return "Invalid User";
	}

}
