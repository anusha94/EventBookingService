package com.bookevents.model;

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
public class Screen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String name;
	
	Integer numberOfSeats;

	public Screen(String name, Integer numberOfSeats) {
		this.name = name;
		this.numberOfSeats = numberOfSeats;
	}
	

	
}
