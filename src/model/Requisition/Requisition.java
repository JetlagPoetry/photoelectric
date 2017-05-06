package model.Requisition;

import java.util.Date;

public class Requisition {
	private int    requisition_id;         //领料单id
	private int    order_id;               //订单id
	private int    station_id;             //工位id
	private int    requisition_status;     //领料单状态
	private Date   requisition_placetime;  //领料单下单时间
	private Date   requisition_gettime;    //领料单领取时间
	private int    requisition_type;       //领料单类别  （1——物料  2——半成品）
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
