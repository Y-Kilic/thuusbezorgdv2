package com.example.demo.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Address {
    @Id
    private UUID id;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address()
    {
        id = UUID.randomUUID();
    }

    public Address(String street, String city, String state, String zipCode)
    {
        this.id = UUID.randomUUID();
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
