package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "bxt sama dep trai";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this page";
    }
    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access this page";
    }
}
