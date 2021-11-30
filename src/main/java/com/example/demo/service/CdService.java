package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.data.Cd;
import com.example.demo.repo.CdRepo;

@Service
public class CdService {
	
	private CdRepo repo; 
	
	public CdService(CdRepo repo) {
		this.repo = repo;
	}
	
	public List<Cd> getAllCds() {
		return this.repo.findAll();
	}
	
	public Cd createCd(Cd cd) {
		return this.repo.save(cd);
	}
	
	public boolean deleteCd(Integer id) {
		this.repo.deleteById(id);
		// 							false
		boolean exists = this.repo.existsById(id);
		// flips to true for logical sense
		return !exists;
	}
	
	public Cd updateCd(Cd cd, Integer id) {
		// find the car to update 
		Optional<Cd> cdToFind = this.repo.findById(id);
		Cd cdToUpdate = cdToFind.get();
		// set that car with the new values
		cdToUpdate.setCd_name(cd.getCd_name());
		cdToUpdate.setYear_released(cd.getYear_released());
		cdToUpdate.setArtist(cd.getArtist());
		cdToUpdate.setGenre(cd.getGenre());
		cdToUpdate.setPrice(cd.getPrice()); 
		//save updated car
		return this.repo.save(cdToUpdate);
	}
		
	public Optional<Cd> getById(Integer id) {
		Optional<Cd> foundCar = this.repo.findById(id);
		return foundCar;
	}
	
	public List<Cd> getByArtistandReleaseYear(String artist, Integer year_released){
		return this.repo.findCarByArtistandReleaseYear(artist, year_released);
	}
}

