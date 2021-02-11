package com.bookevents.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String name;
	
	String description;
	
	Float runtime;
	
	Date releaseDate;
	

	public Movie(String name, String description, Float runtime, Date releaseDate) {
		this.name = name;
		this.description = description;
		this.runtime = runtime;
		this.releaseDate = releaseDate;
	}
	
	
}
