package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
    @GetMapping("/error")

    String helloWorld(Model model){
        return "You've reached an error page";
    }

//    @GetMapping("/")
//    public String index() {
//        // You can add logic here and return the name of a Thymeleaf or JSP view
//        return "index"; // This assumes there is an "index.html" file in "src/main/resources/templates" directory.
//    }


}
