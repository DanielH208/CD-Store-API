package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.data.Cd;


public interface CdRepo extends JpaRepository<Cd, Integer>{
	
	@Query("SELECT c FROM Cd c WHERE c.artist = ?1 AND c.year_released = ?2")// ?1 means first input of findCarByColourAndManufacturer which is colour and ?2 means make
	List<Cd> findCarByArtistandReleaseYear(String artist, Integer year_released);
}
