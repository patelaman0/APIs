package com.demo.APIs.Controller;

import com.demo.APIs.Entity.ItemModel;
import com.demo.APIs.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")

public class ItemController {

    @Autowired ItemService itemService;

    @PostMapping("/add")
        public ResponseEntity<?> addItem (@RequestBody ItemModel itemModel){

        itemService.addItem(itemModel);

        return ResponseEntity.status(200).body("Entry Saved");
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<?> viewById (@PathVariable Long id){

        ItemModel item = itemService.getItem(id);

        if (item == null){
            return ResponseEntity.status(404).body("Item not found");
        }

        return ResponseEntity.status(200).body(item);
    }

}
