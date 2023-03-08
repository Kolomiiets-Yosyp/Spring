package com.example.spring.service;

import com.example.spring.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products= new ArrayList<>();
    private long ID=0;

    {
        products.add(new Product(++ID,"Any product ","description",1000,"Lviv", "Authot"));
        products.add(new Product(++ID,"Some product ","description",1230,"Kiiv", "Authot2"));
    }
    public List<Product> listProducts(){
        return products;
    }
    public void saveProduct(Product product){
        product.setId(++ID);
        products.add(product);
    }
    public void deleteProduct(Long id){
        products.removeIf(product -> product.getId()== id);
    }
}
