package com.Action;

import java.util.List;

import com.Action.entity.Requisition.*;

/**
 * @author rushzhou
 *
 */
public class RequisitionAction extends SuperAction {

	private static final long serialVersionUID = 1L;
	
	/* parameters from front end */
	//1.1
	private int orderId;	
	//1.2 （无）
	//1.3
	private RequisitionA requisition;	
	//1.4
	private int requisitionId;	
	private int requisitionType;	
	
	/* actions */
	//1.1
	/**
	 * getRequisitionListByOrderId: 获取某订单下的领料单列表
	 * @param 
	 * int orderId (订单编号)
	 * @return 
	 * List<RequisitionA> requisitionList (领料单列表，包括领料单的所有属性)
	 */
	public String getRequisitionListByOrderId(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getRequisitionListByOrderId_success";
	}
	//1.2
	/**
	 * getAllUnfinishedRequisitionList: 获取全部未完成领料单列表
	 * @param 
	 * 无
	 * @return 
	 * List<RequisitionA> requisitionList (领料单列表，包括领料单的所有属性)
	 */
	public String getAllUnfinishedRequisitionList(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getAllUnfinishedRequisitionList_success";
	}
	//1.3
	/**
	 * searchRequisitionList: 搜索领料单
	 * @param 
	 * RequisitionA requisition (领料单实体: 如果建立requisition实体则传实体，没有则传入各个字段 [我建议还是传入实体，缺少的字段int置为-1，String置为null] )
	 * @return 
	 * List<RequisitionA> requisitionList (领料单列表，包括领料单的所有属性)
	 */
	public String searchRequisitionList(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_searchRequisitionList_success";
	}
	//1.4
	/**
	 * getRequisitionProductList: 查看领料单详细信息
	 * @param 
	 * int requisitionId (领料单id)
	 * int requisitionType (领料单类别 1——物料  2——半成品)
	 * @return 
	 * List<RequisitionProductA> requisitionProductList (领料单对应的物品/半成品详细信息)
	 */
	public String getRequisitionProductList(){
		List<RequisitionProductA> result = null;
		
		session.setAttribute("requisitionProductList", result);
		return "Requisition_getRequisitionProductList_success";
	}
	
	/* getters and setters */
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public RequisitionA getRequisition() {
		return requisition;
	}
	public void setRequisition(RequisitionA requisition) {
		this.requisition = requisition;
	}
	public int getRequisitionId() {
		return requisitionId;
	}
	public void setRequisitionId(int requisitionId) {
		this.requisitionId = requisitionId;
	}
	public int getRequisitionType() {
		return requisitionType;
	}
	public void setRequisitionType(int requisitionType) {
		this.requisitionType = requisitionType;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
