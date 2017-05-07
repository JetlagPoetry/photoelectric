package com.Action.entity.BOM;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class WipA {
	private int      wipId;         //半成品的id
	private String   wipName;       //半成品的名称
	private String   wipNotes;      //半成品备注
	private Date     wipCreateDate; //半成品日期
	public WipA() {
		super();
	}
	public WipA(int wipId, String wipName, String wipNotes, Date wipCreateDate) {
		super();
		this.wipId = wipId;
		this.wipName = wipName;
		this.wipNotes = wipNotes;
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
	public Date getWipCreateDate() {
		return wipCreateDate;
	}
	public void setWipCreateDate(Date wipCreateDate) {
		this.wipCreateDate = wipCreateDate;
	}
	
}
