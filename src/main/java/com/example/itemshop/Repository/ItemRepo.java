package com.example.itemshop.Repository;

import com.example.itemshop.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {

    List<Item> findItemByItemID(int itemID);
}
