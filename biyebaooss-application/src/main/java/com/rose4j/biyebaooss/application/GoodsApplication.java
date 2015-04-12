package com.rose4j.biyebaooss.application;


import java.util.List;
import java.util.Set;
import  com.rose4j.biyebaooss.core.domain.Goods;

public interface GoodsApplication {

	public Goods getGoods(Long id);
	
	public void creatGoods(Goods goods);
	
	public void updateGoods(Goods goods);
	
	public void removeGoods(Goods goods);
	
	public void removeGoodss(Set<Goods> goodss);
	
	public List<Goods> findAllGoods();
	
}

