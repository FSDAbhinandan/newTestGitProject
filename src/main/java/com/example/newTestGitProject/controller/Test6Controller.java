package com.example.newTestGitProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test6Controller {
	
	@GetMapping("Shyam")
	public void printValue() {
		System.out.println("Value");
	} 

}
