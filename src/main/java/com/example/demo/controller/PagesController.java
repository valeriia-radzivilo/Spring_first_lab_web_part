package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {

    @RequestMapping("/valeriia")
    public String valeriia() {
        return "valeriia";
    }
    @RequestMapping("/maksym")
    public String maksym() {
        return "maksym";
    }
    @RequestMapping("/yurii")
    public String yurii() {
        return "yurii";
    }
}
