package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DishRepository extends JpaRepository<Dish, UUID> {
}
