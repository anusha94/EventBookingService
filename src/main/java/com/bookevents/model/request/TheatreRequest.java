package com.bookevents.model.request;


import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TheatreRequest {

	String city;
	
	@NotEmpty
	Integer numberOfScreens;
}
