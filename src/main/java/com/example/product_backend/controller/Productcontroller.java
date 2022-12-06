package com.example.product_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Productcontroller {
    @PostMapping("/add")
    public String add(){
        return "Adding Product";
    }
}
