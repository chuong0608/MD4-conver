package com.example.demo7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping()
    public String index(){
        return "index";
    }

    @PostMapping ("/greeting")
    public String greeting(@RequestParam Float usd,Float rate, Model model) {
        float rs = usd * rate;
        model.addAttribute("rs", rs);
        return "result";
    }
}