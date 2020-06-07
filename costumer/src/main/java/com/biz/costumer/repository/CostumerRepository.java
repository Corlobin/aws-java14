package com.biz.costumer.repository;

import com.biz.costumer.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CostumerRepository extends JpaRepository<Costumer, Long> {
    List<Costumer> findByNameContainingIgnoreCase(String name);
}