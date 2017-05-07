package com.Action.entity.BOM;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class MaterialInWipA {
	private int      materialId;          //物料的id
	private String   materialName;        //物料的名称
	private String   materialNotes;       //物料备注
	private int   	 materialBom;         //所需物料数量
	private int      materialProcess;     //物料工序
	private Date     materialCreateDate;  //物料日期
	public MaterialInWipA() {
		super();
	}
	
	public MaterialInWipA(int materialId, int materialBom) {
		super();
		this.materialId = materialId;
		this.materialBom = materialBom;
		
		this.materialName = null;
		this.materialNotes = null;
		this.materialProcess = -1;
		this.materialCreateDate = null;
	}

	public MaterialInWipA(int materialId, String materialName, String materialNotes, int materialBom,
			int materialProcess, Date materialCreateDate) {
		super();
		this.materialId = materialId;
		this.materialName = materialName;
		this.materialNotes = materialNotes;
		this.materialBom = materialBom;
		this.materialProcess = materialProcess;
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
	public int getMaterialBom() {
		return materialBom;
	}
	public void setMaterialBom(int materialBom) {
		this.materialBom = materialBom;
	}
	public int getMaterialProcess() {
		return materialProcess;
	}
	public void setMaterialProcess(int materialProcess) {
		this.materialProcess = materialProcess;
	}
	public Date getMaterialCreateDate() {
		return materialCreateDate;
	}
	public void setMaterialCreateDate(Date materialCreateDate) {
		this.materialCreateDate = materialCreateDate;
	}

}
