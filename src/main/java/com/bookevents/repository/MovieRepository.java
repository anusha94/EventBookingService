package com.bookevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookevents.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

	Movie findByName(String name);
}
