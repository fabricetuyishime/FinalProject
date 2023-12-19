package com.example.parkingmanagementsystemsecured.repository;

import com.example.parkingmanagementsystemsecured.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Integer> {
}
