package com.backend.resto.repository;

import com.backend.resto.entity.Table_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Table_Details_Repo extends JpaRepository<Table_Details,Integer> {
}
