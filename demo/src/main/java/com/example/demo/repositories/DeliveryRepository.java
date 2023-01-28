package com.example.demo.repositories;

import com.example.demo.domain.Address;
import com.example.demo.domain.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeliveryRepository extends JpaRepository<Delivery, UUID> {
}
