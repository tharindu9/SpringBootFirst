package com.tra.test.Services;

import java.util.List;

import com.tra.test.domain.UserMode;

public interface UserService {
	
	public List<UserMode> getAllUsers();
	
	 String saveUser(UserMode userMode);
		
	

}
 