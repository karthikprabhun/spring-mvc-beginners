package com.mvc.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
    @ResponseBody
    @GetMapping("/employee")
    public String getStudents() {

        return "employee page";
    }

}
