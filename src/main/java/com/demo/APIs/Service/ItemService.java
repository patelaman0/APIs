package com.demo.APIs.Service;

import com.demo.APIs.Entity.ItemModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private List<ItemModel> items = new ArrayList<>();

    public ItemModel addItem(ItemModel itemModel) {

        items.add(itemModel);

        return itemModel;
    }


    public ItemModel getItem(Long id) {

        for(ItemModel itemModel :items){

            if(itemModel.getId().equals(id)){

                return itemModel;

            }
        }
        return null;
    }


}
