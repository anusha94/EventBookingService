package com.bookevents.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookevents.model.City;



public interface CityRepository extends CrudRepository<City, String>{
	
	City findByName(String name);
	
	@Override
    List<City> findAll();
}
