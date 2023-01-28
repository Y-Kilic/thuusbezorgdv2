package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
