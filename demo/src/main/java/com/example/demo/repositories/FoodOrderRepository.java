package com.example.demo.repositories;

import com.example.demo.domain.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FoodOrderRepository extends JpaRepository<FoodOrder, UUID> {
}
