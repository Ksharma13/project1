package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	@RequestMapping("/")
	public String hello(@RequestParam(name= "name", defaultValue = "Sharma  Good Afternoon")String name) {
		return "Kritika " + name;

}
}

