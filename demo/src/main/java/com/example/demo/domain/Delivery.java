package com.example.demo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Delivery {
    @Id
    private UUID id;
    @OneToOne
    private FoodOrder foodOrder;
    @ManyToOne
    private Rider rider;
    @OneToOne
    private Address address;
    private LocalDateTime deliveryTime;
    public Delivery()
    {
        id = UUID.randomUUID();
    }

    public Delivery(FoodOrder foodOrder, Rider rider, Address address, LocalDateTime deliveryTime)
    {
        this.id = UUID.randomUUID();
        this.foodOrder = foodOrder;
        this.rider = rider;
        this.address = address;
        this.deliveryTime = deliveryTime;
    }
}