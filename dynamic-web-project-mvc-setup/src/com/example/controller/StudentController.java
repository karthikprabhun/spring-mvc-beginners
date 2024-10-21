package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/form")
	public String form() {
		return "form";
	}

	/* @ResponseBody */
	@PostMapping("/submit")
	public ResponseEntity<String> handleFormSubmission(@RequestBody Student student) {

		String responseMessage = "Received student name:" + student.getName() + " with age : " + student.getAge() + " ";
		System.out.println("submit cllaed");

		return ResponseEntity.ok(responseMessage);
	}

}
