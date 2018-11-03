package com.tra.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.tra.test.Controllers.Users;
import com.tra.test.domain.UserMode;
import com.tra.test.repositories.UserRepositorie;

import java.util.List;

@Service
public class UserSericeimp implements UserService {
	
	@Autowired
	private UserRepositorie userRepositorie;

	@Override
	public List<UserMode> getAllUsers() {
		List<UserMode> allUsers = userRepositorie.findAll();
		return allUsers;	
	}
    
	@Override
	public String saveUser(UserMode userMode) {
		// TODO Auto-generated method stub
		 userRepositorie.save(userMode);
		 return "Data saved";
	}
	@Override
	public String updateNewUser(UserMode updateUser) {
		String msg = "";
		if(updateUser.getId() != null) {
			userRepositorie.save(updateUser);
			msg = "data updated";
		}
		else {
			msg ="error";
		}
		return msg;
	}

	@Override
	public UserMode findById(Integer id) {
		//return userRepositorie.findOne(id);
		return null;
	}
	
	
	

	
}
