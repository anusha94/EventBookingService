package com.bookevents.model;

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
public class SeatMapping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	String seatIdentifier;
	
	Integer screenId;
	
	Integer theatreId;

	public SeatMapping(String seatIdentifier, Integer screenId, Integer theatreId) {
		this.seatIdentifier = seatIdentifier;
		this.screenId = screenId;
		this.theatreId = theatreId;
	}
	
	

}
