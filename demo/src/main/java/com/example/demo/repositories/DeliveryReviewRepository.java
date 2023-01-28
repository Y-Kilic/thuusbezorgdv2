package com.example.demo.repositories;

import com.example.demo.domain.Delivery;
import com.example.demo.domain.DeliveryReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryReviewRepository extends JpaRepository<DeliveryReview, UUID> {
}
