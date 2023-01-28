package com.example.demo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class FoodOrder {
    @Id
    private UUID id;
    @ManyToOne
    private Address address;
    private LocalDateTime orderTime;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    @OneToMany(mappedBy = "foodOrder")
    private List<OrderedDish> dishes;
    public FoodOrder()
    {
        id = UUID.randomUUID();
    }

    public FoodOrder(Address address, LocalDateTime orderTime, OrderStatus status)
    {
        this.id = UUID.randomUUID();
        this.address = address;
        this.orderTime = orderTime;
        this.status = status;
    }
}