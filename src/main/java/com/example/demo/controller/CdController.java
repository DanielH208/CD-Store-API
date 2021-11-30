package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.data.Cd;
import com.example.demo.service.CdService;

@RestController // allows us to send JSON data back, or other forms of data medium, indicates this is a component/bean to the AppContext
@RequestMapping(path = "/cd")
public class CdController {

private CdService service;
	
	public CdController(CdService service ) {
		this.service = service;
	}
	
    @GetMapping("/getAll")
    public ResponseEntity<List<Cd>> get() {
        ResponseEntity<List<Cd>> response = new ResponseEntity<List<Cd>>(this.service.getAllCds(), HttpStatus.OK); //200
        return response;
    }
	
    @PostMapping("/create")
    public ResponseEntity<Cd> addCar(@RequestBody Cd cd){
    	ResponseEntity<Cd> response = new ResponseEntity<Cd>(this.service.createCd(cd), HttpStatus.CREATED); //201
    	return response;
    }
    
    @DeleteMapping("/delete/{id}") 
    public ResponseEntity<?> deleteCd(@PathVariable Integer id){
    	boolean deleted = this.service.deleteCd(id);
    	if(deleted) {
    		return new ResponseEntity<>(HttpStatus.OK);
    	} else {
    		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    	}
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Cd> updateCd(@RequestBody Cd cd, @PathVariable Integer id) {
    	ResponseEntity<Cd> response = new ResponseEntity<Cd>(this.service.updateCd(cd, id), HttpStatus.ACCEPTED); //202
    	return response;
    }
	
	
}
