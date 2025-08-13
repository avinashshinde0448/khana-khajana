package com.backend.resto.repository;

import com.backend.resto.entity.User_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_details_Repo extends JpaRepository<User_Details,Integer> {
}
