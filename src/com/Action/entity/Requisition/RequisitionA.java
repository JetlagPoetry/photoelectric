package com.Action.entity.Requisition;

import java.util.Date;

/**
 * @author rushzhou
 *
 */
public class RequisitionA {
	private int    requisitionId;         //领料单id
	private int    orderId;               //订单id
	private int    stationId;             //工位id
	private int    requisitionStatus;     //领料单状态
	private Date   requisitionPlaceTime;  //领料单下单时间
	private Date   requisitionGetTime;    //领料单领取时间
	private int    requisitionType;       //领料单类别  （1——物料  2——半成品）
	public RequisitionA() {
		super();
	}
	public RequisitionA(int requisitionId, int orderId, int stationId, int requisitionStatus, Date requisitionPlaceTime,
			Date requisitionGetTime, int requisitionType) {
		super();
		this.requisitionId = requisitionId;
		this.orderId = orderId;
		this.stationId = stationId;
		this.requisitionStatus = requisitionStatus;
		this.requisitionPlaceTime = requisitionPlaceTime;
		this.requisitionGetTime = requisitionGetTime;
		this.requisitionType = requisitionType;
	}
	public int getRequisitionId() {
		return requisitionId;
	}
	public void setRequisitionId(int requisitionId) {
		this.requisitionId = requisitionId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getStationId() {
		return stationId;
	}
	public void setStationId(int stationId) {
		this.stationId = stationId;
	}
	public int getRequisitionStatus() {
		return requisitionStatus;
	}
	public void setRequisitionStatus(int requisitionStatus) {
		this.requisitionStatus = requisitionStatus;
	}
	public Date getRequisitionPlaceTime() {
		return requisitionPlaceTime;
	}
	public void setRequisitionPlaceTime(Date requisitionPlaceTime) {
		this.requisitionPlaceTime = requisitionPlaceTime;
	}
	public Date getRequisitionGetTime() {
		return requisitionGetTime;
	}
	public void setRequisitionGetTime(Date requisitionGetTime) {
		this.requisitionGetTime = requisitionGetTime;
	}
	public int getRequisitionType() {
		return requisitionType;
	}
	public void setRequisitionType(int requisitionType) {
		this.requisitionType = requisitionType;
	}
	
	
}
