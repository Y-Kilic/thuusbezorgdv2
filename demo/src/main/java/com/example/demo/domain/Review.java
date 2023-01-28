package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Review {
    @Id
    private UUID id;
    private String comment;
    @Enumerated(EnumType.STRING)
    private ReviewRating rating;
    public Review()
    {
        id = UUID.randomUUID();
    }

    public Review(String comment, ReviewRating rating)
    {
        this.id = UUID.randomUUID();
        this.comment = comment;
        this.rating = rating;
    }
}
