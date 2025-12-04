package com.example.bookMS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/hello")
    public String helloUser(Model model){
        model.addAttribute("userName", "HnaulLim!");
        return "helloUser";
    }
}
