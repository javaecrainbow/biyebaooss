package com.rose4j.biyebaooss.facade;

import java.util.List;
import org.dayatang.utils.Page;
import org.openkoala.koala.commons.InvokeResult;
import com.rose4j.biyebaooss.facade.dto.*;

public interface BookingFacade {

	public InvokeResult getBooking(Long id);
	
	public InvokeResult creatBooking(BookingDTO booking);
	
	public InvokeResult updateBooking(BookingDTO booking);
	
	public InvokeResult removeBooking(Long id);
	
	public InvokeResult removeBookings(Long[] ids);
	public InvokeResult checkBooking(Long[] ids,String currentUser);

	public List<BookingDTO> findAllBooking();
	
	public Page<BookingDTO> pageQueryBooking(BookingDTO booking, int currentPage, int pageSize);
	

}

