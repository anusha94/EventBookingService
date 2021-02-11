package com.bookevents.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookevents.model.City;
import com.bookevents.model.Movie;
import com.bookevents.model.Shows;
import com.bookevents.model.Theatre;
import com.bookevents.model.request.TheatreRequest;
import com.bookevents.repository.CityRepository;
import com.bookevents.repository.MovieRepository;
import com.bookevents.repository.ShowsRepository;
import com.bookevents.repository.TheatreRepository;

@Service
public class AdminService {
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private TheatreRepository theatreRepository;
	
	@Autowired
	private ShowsRepository showsRepository;
	
	@Autowired
	private MovieRepository movieRepository;

	public Theatre addTheatre(TheatreRequest theatreRequest) {
		City city = this.cityRepository.findByName(theatreRequest.getCity());
		Theatre theatre = new Theatre(city.getId(), theatreRequest.getNumberOfScreens());
		return theatreRepository.save(theatre);
	}
	
	public List<City> getAllCities() {
		List<City> cities = this.cityRepository.findAll();
		return cities;
	}
	
//	public Shows addShows(ShowRequest showRequest) {
//		Shows show = new Shows(showRequest.getTheatreId(), showRequest.getScreenId(), showRequest.getMovieId(), showRequest.getShowTime());
//		return showsRepository.save(show);
//	}
	
	public List<Theatre> getTheatresByMovieAndCity(String movieName, String cityName) {
		Movie movie = this.movieRepository.findByName(cityName);
		City city = this.cityRepository.findByName(cityName);
		List<Shows> shows = this.showsRepository.findByMovieId(movie.getId());
		List<Integer> theatreIds = shows.stream().map(Shows::getTheatreId).collect(Collectors.toList());
		List<Theatre> theatres = this.theatreRepository.findAllByIdsAndCityId(theatreIds, city.getId());
		return theatres;
	}
	
	public List<Shows> getShowsByTheatreAndMovie(String theatreName, String movieName) {
		Movie movie = this.movieRepository.findByName(movieName);
		Theatre theatre = this.theatreRepository.findByName(theatreName);
		List<Shows> shows = this.showsRepository.findAllByTheatreIdAndMovieId(theatre.getId(), movie.getId());
		return shows;
	}
}
