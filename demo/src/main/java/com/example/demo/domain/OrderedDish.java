package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class OrderedDish {
    @Id
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private FoodOrder foodOrder;
    @ManyToOne
    private Dish dish;
    private int quantity;
    public OrderedDish()
    {
        id = UUID.randomUUID();
    }

    public OrderedDish(FoodOrder foodOrder, Dish dish, int quantity)
    {
        this.id = UUID.randomUUID();
        this.foodOrder = foodOrder;
        this.dish = dish;
        this.quantity = quantity;
    }
}