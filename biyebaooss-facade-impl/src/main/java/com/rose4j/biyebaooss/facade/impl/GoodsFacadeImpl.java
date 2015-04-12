package com.rose4j.biyebaooss.facade.impl;

import java.sql.Timestamp;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.inject.Named;

import org.dayatang.domain.InstanceFactory;
import org.dayatang.querychannel.QueryChannelService;
import org.dayatang.utils.Page;
import org.openkoala.koala.commons.InvokeResult;

import com.rose4j.biyebaooss.application.GoodsApplication;
import com.rose4j.biyebaooss.core.domain.Goods;
import com.rose4j.biyebaooss.facade.GoodsFacade;
import com.rose4j.biyebaooss.facade.dto.GoodsDTO;
import com.rose4j.biyebaooss.facade.impl.assembler.GoodsAssembler;

@Named
public class GoodsFacadeImpl implements GoodsFacade {

	@Inject
	private GoodsApplication application;

	private QueryChannelService queryChannel;

	private QueryChannelService getQueryChannelService() {
		if (queryChannel == null) {
			queryChannel = InstanceFactory.getInstance(
					QueryChannelService.class, "queryChannel");
		}
		return queryChannel;
	}

	public InvokeResult getGoods(Long id) {
		return InvokeResult.success(GoodsAssembler.toDTO(application
				.getGoods(id)));
	}

	public InvokeResult creatGoods(GoodsDTO goodsDTO) {
		goodsDTO.setAddTime(new Timestamp(System.currentTimeMillis()));
		goodsDTO.setUpdateTime(new Timestamp(System.currentTimeMillis()));
		goodsDTO.setPostTime(new Timestamp(System.currentTimeMillis()));
		goodsDTO.setUpdaterName("admin");

		goodsDTO.setAdderName("admin");
		application.creatGoods(GoodsAssembler.toEntity(goodsDTO));
		return InvokeResult.success();
	}

	public InvokeResult updateGoods(GoodsDTO goodsDTO) {
		Goods goods = Goods.get(Goods.class, goodsDTO.getId());
		// 设置要更新的值
		goodsDTO.setAddTime(goods.getAddTime());
		goodsDTO.setAdderName(goods.getAdderName());
		goodsDTO.setPostTime(goods.getPostTime());
		goodsDTO.setUpdateTime(new Timestamp(System.currentTimeMillis()));
		goodsDTO.setUpdaterName("admin");

		application.updateGoods(GoodsAssembler.toEntity(goodsDTO));
		return InvokeResult.success();
	}

	public InvokeResult removeGoods(Long id) {
		application.removeGoods(application.getGoods(id));
		return InvokeResult.success();
	}

	public InvokeResult removeGoodss(Long[] ids) {
		Set<Goods> goodss = new HashSet<Goods>();
		for (Long id : ids) {
			goodss.add(application.getGoods(id));
		}
		application.removeGoodss(goodss);
		return InvokeResult.success();
	}

	public List<GoodsDTO> findAllGoods() {
		return GoodsAssembler.toDTOs(application.findAllGoods());
	}

	public Page<GoodsDTO> pageQueryGoods(GoodsDTO queryVo, int currentPage,
			int pageSize) {
		List<Object> conditionVals = new ArrayList<Object>();
		StringBuilder jpql = new StringBuilder(
				"select _goods from Goods _goods   where 1=1 ");
		if (queryVo.getName() != null && !"".equals(queryVo.getName())) {
			jpql.append(" and _goods.name like ?");
			conditionVals.add(MessageFormat.format("%{0}%", queryVo.getName()));
		}
		if (queryVo.getDbType() != null && !"".equals(queryVo.getDbType())) {
			jpql.append(" and _goods.dbType like ?");
			conditionVals
					.add(MessageFormat.format("%{0}%", queryVo.getDbType()));
		}
		if (queryVo.getLangType() != null && !"".equals(queryVo.getLangType())) {
			jpql.append(" and _goods.langType like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getLangType()));
		}
		if (queryVo.getSummary() != null && !"".equals(queryVo.getSummary())) {
			jpql.append(" and _goods.summary like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getSummary()));
		}
		if (queryVo.getWeights() != null) {
			jpql.append(" and _goods.weights=?");
			conditionVals.add(queryVo.getWeights());
		}
		if (queryVo.getSaleNum() != null) {
			jpql.append(" and _goods.saleNum=?");
			conditionVals.add(queryVo.getSaleNum());
		}
		if (queryVo.getSourceType() != null
				&& !"".equals(queryVo.getSourceType())) {
			jpql.append(" and _goods.sourceType like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getSourceType()));
		}
		if (queryVo.getViewNum() != null) {
			jpql.append(" and _goods.viewNum=?");
			conditionVals.add(queryVo.getViewNum());
		}
		if (queryVo.getRecommend() != null
				&& !"".equals(queryVo.getRecommend())) {
			jpql.append(" and _goods.recommend like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getRecommend()));
		}
		if (queryVo.getAdderName() != null
				&& !"".equals(queryVo.getAdderName())) {
			jpql.append(" and _goods.adderName like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getAdderName()));
		}
		if (queryVo.getUpdaterName() != null
				&& !"".equals(queryVo.getUpdaterName())) {
			jpql.append(" and _goods.updaterName like ?");
			conditionVals.add(MessageFormat.format("%{0}%",
					queryVo.getUpdaterName()));
		}
		Page<Goods> pages = getQueryChannelService()
				.createJpqlQuery(jpql.toString()).setParameters(conditionVals)
				.setPage(currentPage, pageSize).pagedList();

		return new Page<GoodsDTO>(pages.getStart(), pages.getResultCount(),
				pageSize, GoodsAssembler.toDTOs(pages.getData()));
	}

}
