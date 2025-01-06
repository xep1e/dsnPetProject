package com.example.demo.products;

import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServise {
    private final ProductsRepository productsRepository;
@Autowired
    public ProductServise(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }
    public List<Products> getProducts() {
        return productsRepository.findAll();

    }
    public Products addProduct(String name, String description, BigDecimal price, Integer category_id){
    Products products= new Products();
    products.setName(name);
    products.setDescription(description);
    products.setPrice(price);
    products.setCategory_id(category_id);
    return  productsRepository.save(products);
    }
}
