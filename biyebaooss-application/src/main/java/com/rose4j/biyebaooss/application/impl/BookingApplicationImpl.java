package com.rose4j.biyebaooss.application.impl;

import java.util.List;
import java.util.Set;
import javax.inject.Named;
import org.springframework.transaction.annotation.Transactional;
import com.rose4j.biyebaooss.application.BookingApplication;
import com.rose4j.biyebaooss.core.domain.Booking;

@Named
@Transactional
public class BookingApplicationImpl implements BookingApplication {

	public Booking getBooking(Long id) {
		return Booking.get(Booking.class, id);
	}
	
	public void creatBooking(Booking booking) {
		booking.save();
	}
	
	public void updateBooking(Booking booking) {
		booking .save();
	}
	
	public void removeBooking(Booking booking) {
		if(booking != null){
			booking.remove();
		}
	}
	
	public void removeBookings(Set<Booking> bookings) {
		for (Booking booking : bookings) {
			booking.remove();
		}
	}
	
	public List<Booking> findAllBooking() {
		return Booking.findAll(Booking.class);
	}
	
}
