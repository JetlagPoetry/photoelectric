package model.BOM;

import java.util.Date;

public class Goods {
	private String  goods_name;       //��Ʒ����
	private String  goods_state;      //��Ʒ״̬
	private String  goods_note;       //��Ʒ��ע
	private Date  goods_createDate;   //��Ʒ��������
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
	public String getGoods_state() {
		return goods_state;
	}
	public void setGoods_state(String goods_state) {
		this.goods_state = goods_state;
	}
	public String getGoods_note() {
		return goods_note;
	}
	public void setGoods_note(String goods_note) {
		this.goods_note = goods_note;
	}
	public Date getGoods_createDate() {
		return goods_createDate;
	}
	public void setGoods_createDate(Date goods_createDate) {
		this.goods_createDate = goods_createDate;
	}
	
}
