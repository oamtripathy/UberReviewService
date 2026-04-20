package com.example.uberreviewservice.repository;

import com.example.uberreviewservice.models.Booking;
import com.example.uberreviewservice.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {


}
