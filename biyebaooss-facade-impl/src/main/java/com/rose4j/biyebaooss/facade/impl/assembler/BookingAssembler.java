package com.rose4j.biyebaooss.facade.impl.assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.rose4j.biyebaooss.facade.dto.*;
import com.rose4j.biyebaooss.core.domain.*;

public class BookingAssembler {
	
	public static BookingDTO  toDTO(Booking  booking){
		if (booking == null) {
			return null;
		}
    	BookingDTO result  = new BookingDTO();
	    	result.setId (booking.getId());
     	    	result.setVersion (booking.getVersion());
     	    	result.setTitle (booking.getTitle());
     	    	result.setDbType (booking.getDbType());
     	    	result.setLangType (booking.getLangType());
     	    	result.setMail (booking.getMail());
     	    	result.setTelephone (booking.getTelephone());
     	    	result.setBookingTime (booking.getBookingTime());
     	    	result.setMark (booking.getMark());
     	    	result.setContents (booking.getContents());
     	    	result.setAuditor (StringUtils.isBlank(booking.getAuditor())?"未审核":booking.getAuditor());
     	    return result;
	 }
	
	public static List<BookingDTO>  toDTOs(Collection<Booking>  bookings){
		if (bookings == null) {
			return null;
		}
		List<BookingDTO> results = new ArrayList<BookingDTO>();
		for (Booking each : bookings) {
			results.add(toDTO(each));
		}
		return results;
	}
	
	 public static Booking  toEntity(BookingDTO  bookingDTO){
	 	if (bookingDTO == null) {
			return null;
		}
	 	Booking result  = new Booking();
        result.setId (bookingDTO.getId());
         result.setVersion (bookingDTO.getVersion());
         result.setTitle (bookingDTO.getTitle());
         result.setDbType (bookingDTO.getDbType());
         result.setLangType (bookingDTO.getLangType());
         result.setMail (bookingDTO.getMail());
         result.setTelephone (bookingDTO.getTelephone());
         result.setBookingTime (bookingDTO.getBookingTime());
         result.setMark (bookingDTO.getMark());
         result.setContents (bookingDTO.getContents());
         result.setAuditor (bookingDTO.getAuditor());
 	  	return result;
	 }
	
	public static List<Booking> toEntities(Collection<BookingDTO> bookingDTOs) {
		if (bookingDTOs == null) {
			return null;
		}
		
		List<Booking> results = new ArrayList<Booking>();
		for (BookingDTO each : bookingDTOs) {
			results.add(toEntity(each));
		}
		return results;
	}
}
