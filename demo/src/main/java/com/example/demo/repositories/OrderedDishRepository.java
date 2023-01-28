package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.OrderedDish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderedDishRepository extends JpaRepository<OrderedDish, UUID> {
}
