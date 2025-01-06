package com.example.demo.products;

import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductsController {
    private final ProductServise productServise;

@Autowired
    public ProductsController(ProductServise productServise) {
        this.productServise = productServise;
    }
    @GetMapping
    public List<Products> getUsers() {
        return productServise.getProducts();
    }
    @PostMapping
    public  void  redProduct(@RequestBody Products products){
    productServise.addProduct(products.getName(),products.getDescription(),products.getPrice(),products.getCategory_id());
    }
}
