package com.example.itemshop.Controller;

import com.example.itemshop.Model.Category;
import com.example.itemshop.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @PostMapping(value="/createCategory", consumes = "application/json")
    public ResponseEntity<Category> newCategory(@RequestBody Category category) {
        System.out.println("category:" + category);
        categoryRepo.save(category);
        System.out.println("Done save category=" + category);
        return new ResponseEntity<Category>(category, HttpStatus.CREATED);
    }

    @GetMapping("/categories")
    public List<Category> allCategories() {
        return categoryRepo.findAll();
    }



}
