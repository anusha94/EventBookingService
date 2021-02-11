package com.bookevents.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookevents.model.Shows;

public interface ShowsRepository extends CrudRepository<Shows, String> {

	List<Shows> findByMovieId(Integer movieId);
	
	List<Shows> findAllByTheatreIdAndMovieId(Integer theatreId, Integer movieId);
}
