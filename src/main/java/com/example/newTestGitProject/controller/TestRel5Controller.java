package com.example.newTestGitProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRel5Controller {
	
	@GetMapping("value")
	public void printValue() {
		System.out.println("Value");
	} 

}
