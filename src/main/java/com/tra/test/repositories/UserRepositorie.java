package com.tra.test.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tra.test.domain.UserMode;

public interface UserRepositorie extends JpaRepository<UserMode, Integer>{
	
}
