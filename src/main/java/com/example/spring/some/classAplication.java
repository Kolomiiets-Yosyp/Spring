package com.example.spring.some;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class classAplication {

    @GetMapping("/")
    public String example(Model model) {
        int num=14;
        model.addAttribute("atribute",num);
        return "home";
    }

}
