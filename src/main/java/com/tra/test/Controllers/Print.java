package com.tra.test.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api")

public class Print {
	

	
@GetMapping("/")
public String main() {
	return "Main page";
}

	
@GetMapping("/hello")
public String PrintSomeThing() {
	return "Hello world" ;
}

}
