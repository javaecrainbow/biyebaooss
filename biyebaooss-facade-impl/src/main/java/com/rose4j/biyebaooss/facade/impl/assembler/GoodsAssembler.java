package com.rose4j.biyebaooss.facade.impl.assembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.rose4j.biyebaooss.facade.dto.*;
import com.rose4j.biyebaooss.core.domain.*;

public class GoodsAssembler {
	
	public static GoodsDTO  toDTO(Goods  goods){
		if (goods == null) {
			return null;
		}
    	GoodsDTO result  = new GoodsDTO();
	    	result.setId (goods.getId());
     	    	result.setVersion (goods.getVersion());
     	    	result.setName (goods.getName());
     	    	result.setDbType (goods.getDbType());
     	    	result.setLangType (goods.getLangType());
     	    	result.setPrice (goods.getPrice());
     	    	result.setSummary (goods.getSummary());
     	    	result.setWeights (goods.getWeights());
     	    	result.setSaleNum (goods.getSaleNum());
     	    	result.setSourceType (goods.getSourceType());
     	    	result.setViewNum (goods.getViewNum());
     	    	result.setRecommend (goods.getRecommend());
     	    	result.setAddTime (goods.getAddTime());
     	    	result.setAdderName (goods.getAdderName());
     	    	result.setPostTime (goods.getPostTime());
     	    	result.setUpdateTime (goods.getUpdateTime());
     	    	result.setUpdaterName (goods.getUpdaterName());
     	    	result.setDescription (goods.getDescription());
     	    return result;
	 }
	
	public static List<GoodsDTO>  toDTOs(Collection<Goods>  goodss){
		if (goodss == null) {
			return null;
		}
		List<GoodsDTO> results = new ArrayList<GoodsDTO>();
		for (Goods each : goodss) {
			results.add(toDTO(each));
		}
		return results;
	}
	
	 public static Goods  toEntity(GoodsDTO  goodsDTO){
	 	if (goodsDTO == null) {
			return null;
		}
	 	Goods result  = new Goods();
        result.setId (goodsDTO.getId());
         result.setVersion (goodsDTO.getVersion());
         result.setName (goodsDTO.getName());
         result.setDbType (goodsDTO.getDbType());
         result.setLangType (goodsDTO.getLangType());
         result.setPrice (goodsDTO.getPrice());
         result.setSummary (goodsDTO.getSummary());
         result.setWeights (goodsDTO.getWeights());
         result.setSaleNum (goodsDTO.getSaleNum());
         result.setSourceType (goodsDTO.getSourceType());
         result.setViewNum (goodsDTO.getViewNum());
         result.setRecommend (goodsDTO.getRecommend());
         result.setAddTime (goodsDTO.getAddTime());
         result.setAdderName (goodsDTO.getAdderName());
         result.setPostTime (goodsDTO.getPostTime());
         result.setUpdateTime (goodsDTO.getUpdateTime());
         result.setUpdaterName (goodsDTO.getUpdaterName());
         result.setDescription (goodsDTO.getDescription());
 	  	return result;
	 }
	
	public static List<Goods> toEntities(Collection<GoodsDTO> goodsDTOs) {
		if (goodsDTOs == null) {
			return null;
		}
		
		List<Goods> results = new ArrayList<Goods>();
		for (GoodsDTO each : goodsDTOs) {
			results.add(toEntity(each));
		}
		return results;
	}
}
