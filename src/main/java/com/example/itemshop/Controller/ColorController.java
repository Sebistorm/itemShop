package com.example.itemshop.Controller;

import com.example.itemshop.Model.Color;
import com.example.itemshop.Model.Item;
import com.example.itemshop.Repository.ColorRepo;
import com.example.itemshop.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ColorController {

    @Autowired
    ColorRepo colorRepo;

    @PostMapping(value="/createColor", consumes = "application/json")
    public ResponseEntity<Color> newColor(@RequestBody Color color) {
        System.out.println("Farve:" + color);
        colorRepo.save(color);
        System.out.println("Done save Farve =" + color);
        return new ResponseEntity<Color>(color, HttpStatus.CREATED);
    }

    @GetMapping("/colors")
    public List<Color> allColors() {
        return colorRepo.findAll();
    }
}
