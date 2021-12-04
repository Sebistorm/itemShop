package com.example.itemshop.Controller;

import com.example.itemshop.Model.Category;
import com.example.itemshop.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @PostMapping(value="/createCategory", consumes = "application/json")
    public ResponseEntity<Category> newTimeSlot(@RequestBody Category category) {
        System.out.println("category:" + category);
        categoryRepo.save(category);
        System.out.println("Done save category=" + category);
        return new ResponseEntity<Category>(category, HttpStatus.CREATED);
    }



}
