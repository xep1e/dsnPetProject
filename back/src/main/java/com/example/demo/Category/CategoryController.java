package com.example.demo.Category;

import com.example.demo.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryController {
@Autowired
    private final CategoryServise categoryServise;

    public CategoryController(CategoryServise categoryServise) {
        this.categoryServise = categoryServise;
    }
    @GetMapping
    public List<Category> getCategorys() {
        return categoryServise.getCategory();
    }

    @PostMapping
    public void regCategory(@RequestBody Category category){
        categoryServise.addCategory(category.getName(),category.getDescription());

    }
}
