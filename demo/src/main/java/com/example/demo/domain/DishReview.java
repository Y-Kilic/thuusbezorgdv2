package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class DishReview {
    @Id
    private UUID id;
    @ManyToOne
    private Dish dish;
    @OneToOne
    private Review review;
    public DishReview()
    {
        id = UUID.randomUUID();
    }

    public DishReview(Dish dish, Review review)
    {
        this.id = UUID.randomUUID();
        this.dish = dish;
        this.review = review;
    }
}
