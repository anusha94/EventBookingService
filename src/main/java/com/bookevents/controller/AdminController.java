package com.bookevents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookevents.model.City;
import com.bookevents.model.Shows;
import com.bookevents.model.Theatre;
import com.bookevents.model.request.TheatreRequest;
import com.bookevents.model.response.ApiResponse;
import com.bookevents.service.AdminService;

import static com.bookevents.utils.Constants.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@PostMapping("/theatres")
	public ResponseEntity<ApiResponse> addTheatre(@RequestBody TheatreRequest theatreRequest) {
		Theatre theatre = adminService.addTheatre(theatreRequest);
		ApiResponse response = new ApiResponse(SUCCESS, theatre);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/cities")
	public ResponseEntity<ApiResponse> getAllCities() {
		List<City> cities = adminService.getAllCities();
		ApiResponse response = new ApiResponse(SUCCESS, cities);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
//	@PostMapping("/shows")
//	public ResponseEntity<ApiResponse> addShows(@RequestBody ShowRequest showRequest) {
//		
//	}
	
	@GetMapping("/theatres")
	public ResponseEntity<ApiResponse> getTheatresByMovieAndCity(@RequestParam String city, @RequestParam String theatre) {
		List<Theatre> theatres = adminService.getTheatresByMovieAndCity(theatre, city);
		ApiResponse response = new ApiResponse(SUCCESS, theatres);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@GetMapping("/shows")
	public ResponseEntity<ApiResponse> getShowsByTheatreAndMovie(@RequestParam String theatre, @RequestParam String movie) {
		List<Shows> shows = adminService.getShowsByTheatreAndMovie(theatre, movie);
		ApiResponse response = new ApiResponse(SUCCESS, shows);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
