package com.Action.entity.BOM;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class WipInGoodsA {
	private int      wipId;         //半成品的id
	private String   wipName;       //半成品的名称
	private String   wipNotes;      //半成品备注
	private int      wipBom ;       //所需半成品数量
	private Date     wipCreateDate; //半成品日期
	public WipInGoodsA() {
		super();
	}
	public WipInGoodsA(int wipId, int wipBom) {
		super();
		this.wipId = wipId;
		this.wipBom = wipBom;
		this.wipName = null;
		this.wipNotes = null;
		this.wipCreateDate = null;
	}
	public WipInGoodsA(int wipId, String wipName, String wipNotes, int wipBom, Date wipCreateDate) {
		super();
		this.wipId = wipId;
		this.wipName = wipName;
		this.wipNotes = wipNotes;
		this.wipBom = wipBom;
		this.wipCreateDate = wipCreateDate;
	}
	public int getWipId() {
		return wipId;
	}
	public void setWipId(int wipId) {
		this.wipId = wipId;
	}
	public String getWipName() {
		return wipName;
	}
	public void setWipName(String wipName) {
		this.wipName = wipName;
	}
	public String getWipNotes() {
		return wipNotes;
	}
	public void setWipNotes(String wipNotes) {
		this.wipNotes = wipNotes;
	}
	public int getWipBom() {
		return wipBom;
	}
	public void setWipBom(int wipBom) {
		this.wipBom = wipBom;
	}
	public Date getWipCreateDate() {
		return wipCreateDate;
	}
	public void setWipCreateDate(Date wipCreateDate) {
		this.wipCreateDate = wipCreateDate;
	}
	
}
