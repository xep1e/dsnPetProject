package com.example.demo.Category;

import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServise {

    private final CategoyRepository repository;
@Autowired
    public CategoryServise(CategoyRepository repository) {
        this.repository = repository;
    }
    public Category addCategory(String name,String description){
        Category category= new Category();
        category.setName(name);
        category.setDescription(description);
        return repository.save(category);
    }
    public List<Category> getCategory() {
        return repository.findAll();

    }
}
