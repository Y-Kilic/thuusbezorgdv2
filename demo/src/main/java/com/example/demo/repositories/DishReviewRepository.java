package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.DishReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DishReviewRepository extends JpaRepository<DishReview, UUID> {
}
