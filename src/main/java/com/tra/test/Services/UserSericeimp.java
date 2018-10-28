package com.tra.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
	

	
}
