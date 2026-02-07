package com.demo.APIs.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemModel {

    @NonNull
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String description;
    @NonNull
    private double price;
}
