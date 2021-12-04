package com.example.itemshop.Repository;

import com.example.itemshop.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {
}
