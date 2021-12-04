package com.example.itemshop.Controller;

import com.example.itemshop.Model.Category;
import com.example.itemshop.Model.Item;
import com.example.itemshop.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ItemController {

    @Autowired
    ItemRepo itemRepo;

    @PostMapping(value="/createItem", consumes = "application/json")
    public ResponseEntity<Item> newItem(@RequestBody Item item) {
        System.out.println("Vare:" + item);
        itemRepo.save(item);
        System.out.println("Done save vare =" + item);
        return new ResponseEntity<Item>(item, HttpStatus.CREATED);
    }

    @GetMapping("/items")
    public List<Item> allItems() {
        return itemRepo.findAll();
    }
}
