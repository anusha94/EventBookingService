package com.bookevents.model.request;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MovieTheatreMappingRequest {

	Integer theatreId;
	
	List<MovieRequest> movieRequest;
}
