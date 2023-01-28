package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Dish {
    @Id
    private UUID id;
    private String name;
    private String description;
    @ManyToMany
    private List<Ingredient> ingredients;
    @OneToMany(mappedBy = "dish")
    private List<DishReview> reviews;
    public Dish()
    {
        id = UUID.randomUUID();
    }

    public Dish(String name, String description, Ingredient... ingredients)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.ingredients = Arrays.asList(ingredients);
        this.reviews = new ArrayList<DishReview>();
    }
    public List<Ingredient> getIngredients() {
        return Collections.unmodifiableList(ingredients);
    }
    public int getAvailable() {
        return this.getIngredients().stream().mapToInt(Ingredient::getNrInStock).min().orElse(0);
    }
    public boolean isVegetarian() {
        return this.ingredients.stream().allMatch(Ingredient::isVegetarian);
    }

}