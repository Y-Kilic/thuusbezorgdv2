package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class DeliveryReview {
    @Id
    private UUID id;
    @ManyToOne
    private Delivery delivery;
    @OneToOne
    private Review review;
    public DeliveryReview()
    {
        id = UUID.randomUUID();
    }

    public DeliveryReview(Delivery delivery, Review review)
    {
        this.id = UUID.randomUUID();
        this.delivery = delivery;
        this.review = review;
    }
}
