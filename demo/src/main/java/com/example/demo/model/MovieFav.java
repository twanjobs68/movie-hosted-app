package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="moviefav")

public class MovieFav {
//each model represents a table in our database and our models are classes
	
	//name of item
	//price of item
	//quantity
	//image
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column
	private String movien;
	@Column
	private String rating;
	@Column
	private String year;
	
	
	public MovieFav() {}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the movie name
	 */
	public String getMovien() {
		return movien;
	}

	/**
	 * @param movie name the name to set
	 */
	public void setMovien(String movien) {
		this.movien = movien;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the  year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

 	
}