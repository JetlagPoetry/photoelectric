package model.Requisition;

import java.util.Date;

public class Requisition {
	private int    requisition_id;         //���ϵ�id
	private int    order_id;               //����id
	private int    station_id;             //��λid
	private int    requisition_status;     //���ϵ�״̬
	private Date   requisition_placetime;  //���ϵ��µ�ʱ��
	private Date   requisition_gettime;    //���ϵ���ȡʱ��
	private int    requisition_type;       //���ϵ����  ��1��������  2�������Ʒ��
	public int getRequisition_id() {
		return requisition_id;
	}
	public void setRequisition_id(int requisition_id) {
		this.requisition_id = requisition_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getStation_id() {
		return station_id;
	}
	public void setStation_id(int station_id) {
		this.station_id = station_id;
	}
	public int getRequisition_status() {
		return requisition_status;
	}
	public void setRequisition_status(int requisition_status) {
		this.requisition_status = requisition_status;
	}
	public Date getRequisition_placetime() {
		return requisition_placetime;
	}
	public void setRequisition_placetime(Date requisition_placetime) {
		this.requisition_placetime = requisition_placetime;
	}
	public Date getRequisition_gettime() {
		return requisition_gettime;
	}
	public void setRequisition_gettime(Date requisition_gettime) {
		this.requisition_gettime = requisition_gettime;
	}
	public int getRequisition_type() {
		return requisition_type;
	}
	public void setRequisition_type(int requisition_type) {
		this.requisition_type = requisition_type;
	}
	
}
