package com.Action.entity.BOM;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class MaterialA {
	private  int     materialId;         //物料的id
	private String   materialName;       //物料的名称
	private String   materialNotes;      //物料备注
	private Date     materialCreateDate; //物料日期
	public MaterialA() {
		super();
	}
	public MaterialA(int materialId, String materialName, String materialNotes, Date materialCreateDate) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialNotes = materialNotes;
		this.materialCreateDate = materialCreateDate;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getMaterialNotes() {
		return materialNotes;
	}
	public void setMaterialNotes(String materialNotes) {
		this.materialNotes = materialNotes;
	}
	public Date getMaterialCreateDate() {
		return materialCreateDate;
	}
	public void setMaterialCreateDate(Date materialCreateDate) {
		this.materialCreateDate = materialCreateDate;
	}
	
	

}
