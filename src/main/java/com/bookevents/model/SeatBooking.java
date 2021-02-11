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
public class SeatBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	
	Integer seatMappingId;
	
	SeatAvailability status;
	
	Date reserveUntil;

	public SeatBooking(Integer seatMappingId, SeatAvailability status, Date reserveUntil) {
		this.seatMappingId = seatMappingId;
		this.status = status;
		this.reserveUntil = reserveUntil;
	}
	
	
}
