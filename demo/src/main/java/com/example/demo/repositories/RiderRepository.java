package com.example.demo.repositories;

import com.example.demo.domain.Review;
import com.example.demo.domain.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RiderRepository extends JpaRepository<Rider, UUID> {
}
