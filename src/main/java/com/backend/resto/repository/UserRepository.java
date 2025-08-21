package com.backend.resto.repository;

import com.backend.resto.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Integer> {
    UserDetails findByName(String name);


    UserDetails findByEmail(String email);
}
