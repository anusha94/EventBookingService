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
public class Theatre {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	Integer cityId;

	Integer numberOfScreens;

	public Theatre(Integer cityId, Integer numberOfScreens) {
		this.cityId = cityId;
		this.numberOfScreens = numberOfScreens;
	}
	
	
	
	
}
