package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Ingredient {
    @Id
    private UUID id;
    private String name;
    private boolean vegetarian;
    private int nrInStock;
    public Ingredient()
    {
        id = UUID.randomUUID();
    }

    public Ingredient(String name, boolean vegetarian, int nrInStock)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.vegetarian = vegetarian;
        this.nrInStock = nrInStock;
    }

    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public int getNrInStock()
    {
        return this.nrInStock;
    }
}
