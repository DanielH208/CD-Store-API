package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.Cd;

public interface CdRepo extends JpaRepository<Cd, Integer>{

}
