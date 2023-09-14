package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/valeriia")
    public String valeriia() {
        return "valeriia";
    }
    @GetMapping("/maksym")
    public String maksym() {
        return "maksym";
    }
    @GetMapping("/yurii")
    public String yurii() {
        return "yurii";
    }
}
