package model.BOM;

import java.util.Date;

public class MaterialInWip {
	private int      Material_id;          //���ϵ�id
	private String   Material_name;        //���ϵ�����
	private String   Material_notes;       //���ϱ�ע
	private String   Material_bom;         //������������
	private int      Material_process;     //���Ϲ���
	private Date     Material_createDate;  //��������
	public int getMaterial_id() {
		return Material_id;
	}
	public void setMaterial_id(int material_id) {
		Material_id = material_id;
	}
	public String getMaterial_name() {
		return Material_name;
	}
	public void setMaterial_name(String material_name) {
		Material_name = material_name;
	}
	public String getMaterial_notes() {
		return Material_notes;
	}
	public void setMaterial_notes(String material_notes) {
		Material_notes = material_notes;
	}
	public String getMaterial_bom() {
		return Material_bom;
	}
	public void setMaterial_bom(String material_bom) {
		Material_bom = material_bom;
	}
	public int getMaterial_process() {
		return Material_process;
	}
	public void setMaterial_process(int material_process) {
		Material_process = material_process;
	}
	public Date getMaterial_createDate() {
		return Material_createDate;
	}
	public void setMaterial_createDate(Date material_createDate) {
		Material_createDate = material_createDate;
	}
	
}
