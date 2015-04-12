package com.rose4j.biyebaooss.facade.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.openkoala.koala.springmvc.JsonDateSerializer;
import org.springframework.format.annotation.DateTimeFormat;

public class GoodsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	private int version;

	private String summary;

	private String sourceType;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date updateTime;

	private String langType;

	private String updaterName;

	private String adderName;

	private Integer viewNum;

	private String recommend;

	private Integer saleNum;

	private BigDecimal price;

	private Integer weights;

	private String description;

	private String name;

	private String dbType;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date addTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date postTime;

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setLangType(String langType) {
		this.langType = langType;
	}

	public String getLangType() {
		return this.langType;
	}

	public void setUpdaterName(String updaterName) {
		this.updaterName = updaterName;
	}

	public String getUpdaterName() {
		return this.updaterName;
	}

	public void setAdderName(String adderName) {
		this.adderName = adderName;
	}

	public String getAdderName() {
		return this.adderName;
	}

	public void setViewNum(Integer viewNum) {
		this.viewNum = viewNum;
	}

	public Integer getViewNum() {
		return this.viewNum;
	}

	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getRecommend() {
		return this.recommend;
	}

	public void setSaleNum(Integer saleNum) {
		this.saleNum = saleNum;
	}

	public Integer getSaleNum() {
		return this.saleNum;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setWeights(Integer weights) {
		this.weights = weights;
	}

	public Integer getWeights() {
		return this.weights;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	@JsonSerialize(using = JsonDateSerializer.class)
	public Date getPostTime() {
		return this.postTime;
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
		GoodsDTO other = (GoodsDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}