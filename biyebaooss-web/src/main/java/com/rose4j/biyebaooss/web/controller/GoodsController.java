package com.rose4j.biyebaooss.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import org.dayatang.utils.Page;
import org.openkoala.koala.commons.InvokeResult;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rose4j.biyebaooss.facade.GoodsFacade;
import com.rose4j.biyebaooss.facade.dto.GoodsDTO;

@Controller
@RequestMapping("/Goods")
public class GoodsController {

	@Inject
	private GoodsFacade goodsFacade;

	@ResponseBody
	@RequestMapping("/add")
	public InvokeResult add(GoodsDTO goodsDTO) {
		return goodsFacade.creatGoods(goodsDTO);
	}

	@ResponseBody
	@RequestMapping("/update")
	public InvokeResult update(GoodsDTO goodsDTO) {
		return goodsFacade.updateGoods(goodsDTO);
	}

	@ResponseBody
	@RequestMapping("/pageJson")
	public Page pageJson(GoodsDTO goodsDTO, @RequestParam int page,
			@RequestParam int pagesize) {
		Page<GoodsDTO> all = goodsFacade.pageQueryGoods(goodsDTO, page,
				pagesize);
		return all;
	}

	@ResponseBody
	@RequestMapping("/delete")
	public InvokeResult remove(@RequestParam String ids) {
		String[] value = ids.split(",");
		Long[] idArrs = new Long[value.length];
		for (int i = 0; i < value.length; i++) {
			idArrs[i] = Long.parseLong(value[i]);
		}
		return goodsFacade.removeGoodss(idArrs);
	}

	@ResponseBody
	@RequestMapping("/get/{id}")
	public InvokeResult get(@PathVariable Long id) {
		return goodsFacade.getGoods(id);
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
		// CustomDateEditor 可以换成自己定义的编辑器。
		// 注册一个Date 类型的绑定器 。
		binder.setAutoGrowCollectionLimit(Integer.MAX_VALUE);
	}

}
