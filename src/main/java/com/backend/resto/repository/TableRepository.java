package com.backend.resto.repository;

import com.backend.resto.entity.TableDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TableDetails,Integer> {
}
