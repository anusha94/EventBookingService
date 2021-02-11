package com.bookevents.model;

import java.util.Date;

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
public class Shows {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	Integer theatreId;
	
	Integer screenId;
	
	Integer movieId;
	
	Date showTime;

	public Shows(Integer theatreId, Integer screenId, Integer movieId, Date showTime) {
		this.theatreId = theatreId;
		this.screenId = screenId;
		this.movieId = movieId;
		this.showTime = showTime;
	}
	
	

}
