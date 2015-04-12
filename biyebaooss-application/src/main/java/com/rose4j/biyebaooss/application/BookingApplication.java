package com.rose4j.biyebaooss.application;


import java.util.List;
import java.util.Set;
import  com.rose4j.biyebaooss.core.domain.Booking;

public interface BookingApplication {

	public Booking getBooking(Long id);
	
	public void creatBooking(Booking booking);
	
	public void updateBooking(Booking booking);
	
	public void removeBooking(Booking booking);
	
	public void removeBookings(Set<Booking> bookings);
	
	public List<Booking> findAllBooking();
	
}

