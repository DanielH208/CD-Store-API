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
@RequestMapping(path = "/car")
public class CdController {

private CdService service;
	
	public CdController(CdService service ) {
		this.service = service;
	}
}
