package com.young.mall.entity;

import java.util.Date;

/**
 * 秒杀商品表
 */
public class MallGoods {

	/**
	 * 秒杀的商品表
 	 */
	private Long id;

	/**
	 * 商品Id
 	 */
	private Long goodsId;

	/**
	 * 秒杀价
 	 */
	private Integer stockCount;

	/**
	 * 库存数量
 	 */
	private Date startDate;

	/**
	 * 秒杀开始时间
 	 */
	private Date endDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getStockCount() {
		return stockCount;
	}
	public void setStockCount(Integer stockCount) {
		this.stockCount = stockCount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
