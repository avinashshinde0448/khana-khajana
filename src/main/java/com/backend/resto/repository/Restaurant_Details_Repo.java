package com.backend.resto.repository;

import com.backend.resto.entity.Restaurant_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Restaurant_Details_Repo  extends JpaRepository<Restaurant_Details,Integer> {
}
