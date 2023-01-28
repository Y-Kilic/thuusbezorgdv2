package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
public class Rider {
    @Id
    private UUID id;
    private String name;
    private String vehicle;
    @OneToMany(mappedBy = "rider")
    private List<Delivery> deliveries;
    public Rider()
    {
        id = UUID.randomUUID();
    }

    public Rider(String name, String vehicle)
    {
        this.id = UUID.randomUUID();
        this.name = name;
        this.vehicle = vehicle;
        this.deliveries = new ArrayList<>();
    }
}
