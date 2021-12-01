package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.example.demo.data.Cd;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts = {"classpath:test-schema.sql","classpath:test-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)


public class CdControllerIntegrationTests {
	
	@Autowired 
	private MockMvc mvc; 
	
	@Autowired 
	private ObjectMapper mapper; 
	
	
	@Test 
	void getAllCdsTest() throws Exception {
		String listOfCdsAsJson = this.mapper.writeValueAsString(List.of(
				new Cd(1,"speed", 2019, "ben newick", "pop", 15.00),
				new Cd(2,"timeless", 1985, "jason smith", "rock", 11.00)
			    ));
		
		RequestBuilder request = get("/cd/getAll");
		 
		ResultMatcher status = status().isOk();
		ResultMatcher content = content().json(listOfCdsAsJson);
		
		this.mvc.perform(request).andExpect(status).andExpect(content);
	}
	
	@Test
	void createCdTest() throws Exception {
		String testCdAsJson = this.mapper.writeValueAsString(new Cd(1,"speed", 2019, "ben newick", "pop", 15.00));
		String testCdAsJsonResponse = this.mapper.writeValueAsString(new Cd(1,"speed", 2019, "ben newick", "pop", 15.00));
		
		RequestBuilder request = post("/cd/create").contentType(MediaType.APPLICATION_JSON).content(testCdAsJson);
		
		ResultMatcher status = status().isCreated(); 
		ResultMatcher content = content().json(testCdAsJsonResponse);
		
		this.mvc.perform(request).andExpect(status).andExpect(content);
	}
	
	@Test 
	void deleteCdTest() throws Exception{
		this.mvc.perform(delete("/cd/delete/1")).andExpect(status().isOk());
	}
	
	@Test 
	void updateCdTest() throws Exception {
		String updatedCdAsJson = this.mapper.writeValueAsString(new Cd(2,"timeless", 1985, "jason smith", "rock", 11.00)); 
		
		RequestBuilder req = put("/cd/update/2").contentType(MediaType.APPLICATION_JSON).content(updatedCdAsJson);
		
		ResultMatcher status = status().isAccepted();
		ResultMatcher content = content().json(updatedCdAsJson);
		
		this.mvc.perform(req).andExpect(status).andExpect(content);
	}
	 
	@Test
	void getCdByIdTest() throws Exception {
		String foundCdAsJson = this.mapper.writeValueAsString(new Cd(1,"speed", 2019, "ben newick", "pop", 15.00)); 
		
		RequestBuilder req = get("/cd/1"); 
		
		ResultMatcher status = status().isOk();
		ResultMatcher content = content().json(foundCdAsJson);
		
		this.mvc.perform(req).andExpect(status).andExpect(content);
	} 
}
