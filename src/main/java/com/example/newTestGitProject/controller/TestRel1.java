package com.example.newTestGitProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRel1 {

	@GetMapping("/name")
	public void printName() {
		System.out.println("NAME");
	} 
	
	@GetMapping("/address")
	public void printName() {
		System.out.println("Address");
	} 
}
