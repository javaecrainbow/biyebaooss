package com.rose4j.biyebaooss.facade.impl;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.text.MessageFormat;

import javax.inject.Inject;
import javax.inject.Named;

import org.dayatang.domain.InstanceFactory;
import org.dayatang.utils.Page;
import org.dayatang.querychannel.QueryChannelService;
import org.openkoala.koala.commons.InvokeResult;

import com.rose4j.biyebaooss.facade.dto.*;
import com.rose4j.biyebaooss.facade.impl.assembler.BookingAssembler;
import com.rose4j.biyebaooss.facade.BookingFacade;
import com.rose4j.biyebaooss.application.BookingApplication;
import com.rose4j.biyebaooss.core.domain.*;

@Named
public class BookingFacadeImpl implements BookingFacade {

	@Inject
	private BookingApplication  application;

	private QueryChannelService queryChannel;

    private QueryChannelService getQueryChannelService(){
       if(queryChannel==null){
          queryChannel = InstanceFactory.getInstance(QueryChannelService.class,"queryChannel");
       }
     return queryChannel;
    }
	
	public InvokeResult getBooking(Long id) {
		return InvokeResult.success(BookingAssembler.toDTO(application.getBooking(id)));
	}
	
	public InvokeResult creatBooking(BookingDTO bookingDTO) {
		application.creatBooking(BookingAssembler.toEntity(bookingDTO));
		return InvokeResult.success();
	}
	
	public InvokeResult updateBooking(BookingDTO bookingDTO) {
		application.updateBooking(BookingAssembler.toEntity(bookingDTO));
		return InvokeResult.success();
	}
	
	public InvokeResult removeBooking(Long id) {
		application.removeBooking(application.getBooking(id));
		return InvokeResult.success();
	}
	
	public InvokeResult removeBookings(Long[] ids) {
		Set<Booking> bookings= new HashSet<Booking>();
		for (Long id : ids) {
			bookings.add(application.getBooking(id));
		}
		application.removeBookings(bookings);
		return InvokeResult.success();
	}
	
	public List<BookingDTO> findAllBooking() {
		return BookingAssembler.toDTOs(application.findAllBooking());
	}
	
	public Page<BookingDTO> pageQueryBooking(BookingDTO queryVo, int currentPage, int pageSize) {
		List<Object> conditionVals = new ArrayList<Object>();
	   	StringBuilder jpql = new StringBuilder("select _booking from Booking _booking   where 1=1 ");
	   	if (queryVo.getTitle() != null && !"".equals(queryVo.getTitle())) {
	   		jpql.append(" and _booking.title like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getTitle()));
	   	}		
	   	if (queryVo.getDbType() != null && !"".equals(queryVo.getDbType())) {
	   		jpql.append(" and _booking.dbType like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getDbType()));
	   	}		
	   	if (queryVo.getLangType() != null && !"".equals(queryVo.getLangType())) {
	   		jpql.append(" and _booking.langType like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getLangType()));
	   	}		
	   	if (queryVo.getMail() != null && !"".equals(queryVo.getMail())) {
	   		jpql.append(" and _booking.mail like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getMail()));
	   	}		
	   	if (queryVo.getTelephone() != null && !"".equals(queryVo.getTelephone())) {
	   		jpql.append(" and _booking.telephone like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getTelephone()));
	   	}		
	   	if (queryVo.getMark() != null && !"".equals(queryVo.getMark())) {
	   		jpql.append(" and _booking.mark like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getMark()));
	   	}		
	   	if (queryVo.getContents() != null && !"".equals(queryVo.getContents())) {
	   		jpql.append(" and _booking.contents like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getContents()));
	   	}		
	   	if (queryVo.getAuditor() != null && !"".equals(queryVo.getAuditor())) {
	   		jpql.append(" and _booking.auditor like ?");
	   		conditionVals.add(MessageFormat.format("%{0}%", queryVo.getAuditor()));
	   	}		
        Page<Booking> pages = getQueryChannelService()
		   .createJpqlQuery(jpql.toString())
		   .setParameters(conditionVals)
		   .setPage(currentPage, pageSize)
		   .pagedList();
		   
        return new Page<BookingDTO>(pages.getStart(), pages.getResultCount(),pageSize, BookingAssembler.toDTOs(pages.getData()));
	}

	@Override
	public InvokeResult checkBooking(Long[] ids,String currentUser) {
		for(Long id:ids){
			Booking booking =application.getBooking(id);
			booking.setAuditor(currentUser);
			application.updateBooking(booking);
		}
		return InvokeResult.success();
	}
	
	
}
