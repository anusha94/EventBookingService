package com.bookevents.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookevents.model.Theatre;

public interface TheatreRepository extends CrudRepository<Theatre, String>{

	List<Theatre> findAllByIdsAndCityId(List<Integer> ids, Integer cityId);
	
	Theatre findByName(String name);
}
