package com.rose4j.biyebaooss.web.controller;

import javax.inject.Inject;

import org.springframework.web.bind.WebDataBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.dayatang.utils.Page;

import com.rose4j.biyebaooss.facade.dto.*;
import com.rose4j.biyebaooss.facade.BookingFacade;

import org.openkoala.koala.commons.InvokeResult;

@Controller
@RequestMapping("/Booking")
public class BookingController {
		
	@Inject
	private BookingFacade bookingFacade;
	
	@ResponseBody
	@RequestMapping("/add")
	public InvokeResult add(BookingDTO bookingDTO) {
		return bookingFacade.creatBooking(bookingDTO);
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public InvokeResult update(BookingDTO bookingDTO) {
		return bookingFacade.updateBooking(bookingDTO);
	}
	
	@ResponseBody
	@RequestMapping("/pageJson")
	public Page pageJson(BookingDTO bookingDTO, @RequestParam int page, @RequestParam int pagesize) {
		Page<BookingDTO> all = bookingFacade.pageQueryBooking(bookingDTO, page, pagesize);
		return all;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public InvokeResult remove(@RequestParam String ids) {
		String[] value = ids.split(",");
        Long[] idArrs = new Long[value.length];
        for (int i = 0; i < value.length; i ++) {
        	        					idArrs[i] = Long.parseLong(value[i]);
						        }
        return bookingFacade.removeBookings(idArrs);
	}
	@ResponseBody
	@RequestMapping("/check")
	public InvokeResult check(@RequestParam String ids) {
		String[] value = ids.split(",");
        Long[] idArrs = new Long[value.length];
        for (int i = 0; i < value.length; i ++) {
        	        					idArrs[i] = Long.parseLong(value[i]);
						        }
        
        return bookingFacade.checkBooking(idArrs);
	}
	@ResponseBody
	@RequestMapping("/get/{id}")
	public InvokeResult get(@PathVariable Long id) {
		return bookingFacade.getBooking(id);
	}
	
		
    @InitBinder    
    public void initBinder(WebDataBinder binder) {  
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");    
        dateFormat.setLenient(false);    
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));    
        //CustomDateEditor 可以换成自己定义的编辑器。  
        //注册一个Date 类型的绑定器 。
        binder.setAutoGrowCollectionLimit(Integer.MAX_VALUE);
    }
	
}
