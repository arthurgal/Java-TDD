package com.example.tdd.repository;

import com.example.tdd.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, String> {


    Optional<Booking> findByReserve(String s);
}
