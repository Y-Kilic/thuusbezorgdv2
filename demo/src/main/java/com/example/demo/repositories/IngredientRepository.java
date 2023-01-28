package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {
}
