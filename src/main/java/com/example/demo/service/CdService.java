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
	
	
	
}
