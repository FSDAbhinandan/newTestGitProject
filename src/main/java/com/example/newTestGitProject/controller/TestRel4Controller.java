package com.example.newTestGitProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRel4Controller {
	@GetMapping("/name")
	public void printName() {
		System.out.println("NAME");
	} 
	@GetMapping("/game")
	public void printGame() {
		System.out.println("GAME");
	} 
	@GetMapping("/fame")
	public void printGame() {
		System.out.println("Fame");
	} 
}
