package com.Action.entity.BOM;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class GoodsA {
	private String  goodsName;       //��Ʒ����
	private String  goodsState;      //��Ʒ״̬
	private String  goodsNote;       //��Ʒ��ע
	private Date    goodsCreateDate; //��Ʒ��������
	private String  categoryName;    //��Ʒ�������
	public GoodsA() {
		super();
	}
	public GoodsA(String goodsName, String goodsState, String goodsNote, Date goodsCreateDate, String categoryName) {
		super();
		this.goodsName = goodsName;
		this.goodsState = goodsState;
		this.goodsNote = goodsNote;
		this.goodsCreateDate = goodsCreateDate;
		this.categoryName = categoryName;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsState() {
		return goodsState;
	}
	public void setGoodsState(String goodsState) {
		this.goodsState = goodsState;
	}
	public String getGoodsNote() {
		return goodsNote;
	}
	public void setGoodsNote(String goodsNote) {
		this.goodsNote = goodsNote;
	}
	public Date getGoodsCreateDate() {
		return goodsCreateDate;
	}
	public void setGoodsCreateDate(Date goodsCreateDate) {
		this.goodsCreateDate = goodsCreateDate;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
}
