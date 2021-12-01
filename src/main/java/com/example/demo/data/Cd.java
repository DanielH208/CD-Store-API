package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Cd {
 
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    
    private String cd_name;
    private Integer year_released;
    private String artist;
    private String genre;
    private Double price;

     
    
    public Cd() { 
    }

 

	public Cd(Integer id, String cd_name, Integer year_released, String artist, String genre, Double price) {
		super();
		this.id = id;
		this.cd_name = cd_name;
		this.year_released = year_released;
		this.artist = artist;
		this.genre = genre;
		this.price = price;
	}

 

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCd_name() {
		return cd_name;
	}
	public void setCd_name(String cd_name) {
		this.cd_name = cd_name;
	}
	public Integer getYear_released() {
		return year_released;
	}
	public void setYear_released(Integer year_released) {
		this.year_released = year_released;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
    
}

