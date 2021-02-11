package com.bookevents.model.request;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShowsRequest {

	Integer screenId;
	List<MovieTheatreMappingRequest> movieThreatreMappingRequest;

	
}
