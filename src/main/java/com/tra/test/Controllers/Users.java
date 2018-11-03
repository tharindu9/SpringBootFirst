package com.tra.test.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tra.test.Services.UserService;
import com.tra.test.domain.UserMode;

@RestController
@RequestMapping("/user")

public class Users {
	
	@Autowired
	private UserService userServices;
	
@GetMapping("/all")	
public List<UserMode> getUsers() {
	return userServices.getAllUsers();
}

@PostMapping("/add")
public String addUser(@RequestBody UserMode userMode) {
	return userServices.saveUser(userMode);
	
}
@PutMapping("/updateUser")
public String updateUser(@RequestBody UserMode updateUser ) {
	return userServices.updateNewUser(updateUser);
 	
}
@GetMapping("find/{id}")
	public UserMode  getUserById(@PathVariable Integer id) {
	return userServices.findById(id);
	
}



}
