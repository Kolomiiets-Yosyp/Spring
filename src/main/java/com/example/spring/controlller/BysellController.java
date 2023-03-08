package com.example.spring.controlller;

import com.example.spring.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BysellController {


    private final ProductService productService;

    public BysellController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products.ftlh";
    }
}
