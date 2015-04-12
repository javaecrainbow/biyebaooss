package com.rose4j.biyebaooss.facade.dto;

import java.sql.Timestamp;
import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.openkoala.koala.springmvc.JsonDateSerializer;
import org.openkoala.koala.springmvc.JsonTimestampSerializer;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class BookingDTO implements Serializable {

	private Long id;

	private int version;

			
		private String mail;
		
				
		private String title;
		
				
		private String auditor;
		
		@DateTimeFormat(iso = ISO.DATE_TIME)
		private Timestamp bookingTime;
		
				
		private String contents;
		
				
		private String langType;
		
				
		private String mark;
		
				
		private String dbType;
		
				
		private String telephone;
		
			
	
	public void setMail(String mail) { 
		this.mail = mail;
	}

	public String getMail() {
		return this.mail;
	}
		
			
	
	public void setTitle(String title) { 
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}
		
			
	
	public void setAuditor(String auditor) { 
		this.auditor = auditor;
	}

	public String getAuditor() {
		return this.auditor;
	}
		
			
	
	public void setBookingTime(Timestamp bookingTime) { 
		this.bookingTime = bookingTime;
	}
	@JsonSerialize(using = JsonTimestampSerializer.class)

	public Timestamp getBookingTime() {
		return this.bookingTime;
	}
		
			
	
	public void setContents(String contents) { 
		this.contents = contents;
	}

	public String getContents() {
		return this.contents;
	}
		
			
	
	public void setLangType(String langType) { 
		this.langType = langType;
	}

	public String getLangType() {
		return this.langType;
	}
		
			
	
	public void setMark(String mark) { 
		this.mark = mark;
	}

	public String getMark() {
		return this.mark;
	}
		
			
	
	public void setDbType(String dbType) { 
		this.dbType = dbType;
	}

	public String getDbType() {
		return this.dbType;
	}
		
			
	
	public void setTelephone(String telephone) { 
		this.telephone = telephone;
	}

	public String getTelephone() {
		return this.telephone;
	}
		
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDTO other = (BookingDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}