package model.BOM;

import java.util.Date;

public class WipInGoods {
	private int      Wip_id;         //���Ʒ��id
	private String   Wip_name;       //���Ʒ������
	private String   Wip_notes;      //���Ʒ��ע
	private int      Wip_bom ;       //������Ʒ����
	private Date     Wip_createDate; //���Ʒ����
	public int getWip_id() {
		return Wip_id;
	}
	public void setWip_id(int wip_id) {
		Wip_id = wip_id;
	}
	public String getWip_name() {
		return Wip_name;
	}
	public void setWip_name(String wip_name) {
		Wip_name = wip_name;
	}
	public String getWip_notes() {
		return Wip_notes;
	}
	public void setWip_notes(String wip_notes) {
		Wip_notes = wip_notes;
	}
	public int getWip_bom() {
		return Wip_bom;
	}
	public void setWip_bom(int wip_bom) {
		Wip_bom = wip_bom;
	}
	public Date getWip_createDate() {
		return Wip_createDate;
	}
	public void setWip_createDate(Date wip_createDate) {
		Wip_createDate = wip_createDate;
	}
	

}
