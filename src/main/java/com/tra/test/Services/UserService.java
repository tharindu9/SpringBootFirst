package com.tra.test.Services;

import java.util.List;

import com.tra.test.domain.UserMode;

public interface UserService {
	
	 public List<UserMode> getAllUsers();
	
	 public String saveUser(UserMode userMode);
	 
	 public String updateNewUser(UserMode updateUser);
	 
	 public UserMode findById(Integer id);
		
	
		
	

}
 