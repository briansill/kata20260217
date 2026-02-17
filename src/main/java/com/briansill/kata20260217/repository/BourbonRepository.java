package com.briansill.kata20260217.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briansill.kata20260217.model.Bourbon;

public interface BourbonRepository extends JpaRepository<Bourbon, Long> {

    List<Bourbon> findByDistillery(String distillery);
    List<Bourbon> findByStyle(String style);
    List<Bourbon> findByNameContainingIgnoreCase(String name);
    List<Bourbon> findByAgeGreaterThanEqual(Integer age);
    
}
