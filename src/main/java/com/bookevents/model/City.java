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
public class City {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String name;

	public City(String name) {
		this.name = name;
	}
	
	
}
