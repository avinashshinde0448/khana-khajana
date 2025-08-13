package com.backend.resto.repository;

import com.backend.resto.entity.Booking_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Booking_Details_Repo extends JpaRepository<Booking_Details,Integer> {
}
