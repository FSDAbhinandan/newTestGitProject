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
	public void printAddress() {
		System.out.println("Address");
	} 
	@GetMapping("/age")
	public void printAge() {
		System.out.println("Address");
	} 
	@GetMapping("/id")
	public void printId() {
		System.out.println("Address");
	} 
}
