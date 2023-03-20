package com.example.spring.some;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class classAplication {

    @GetMapping("/example")
    public String example() {
        return "home";
    }

}
