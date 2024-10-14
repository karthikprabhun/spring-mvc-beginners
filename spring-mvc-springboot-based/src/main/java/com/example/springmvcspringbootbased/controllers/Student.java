package com.example.springmvcspringbootbased.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Student {

    @GetMapping("/students")
    public String getStudent() {
        return "student";
    }

}
