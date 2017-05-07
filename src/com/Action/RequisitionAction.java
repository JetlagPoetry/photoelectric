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
	//1.2 ���ޣ�
	//1.3
	private RequisitionA requisition;	
	//1.4
	private int requisitionId;	
	private int requisitionType;	
	
	/* actions */
	//1.1
	/**
	 * getRequisitionListByOrderId: ��ȡĳ�����µ����ϵ��б�
	 * @param 
	 * int orderId (�������)
	 * @return 
	 * List<RequisitionA> requisitionList (���ϵ��б��������ϵ�����������)
	 */
	public String getRequisitionListByOrderId(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getRequisitionListByOrderId_success";
	}
	//1.2
	/**
	 * getAllUnfinishedRequisitionList: ��ȡȫ��δ������ϵ��б�
	 * @param 
	 * ��
	 * @return 
	 * List<RequisitionA> requisitionList (���ϵ��б��������ϵ�����������)
	 */
	public String getAllUnfinishedRequisitionList(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getAllUnfinishedRequisitionList_success";
	}
	//1.3
	/**
	 * searchRequisitionList: �������ϵ�
	 * @param 
	 * RequisitionA requisition (���ϵ�ʵ��: �������requisitionʵ����ʵ�壬û����������ֶ� [�ҽ��黹�Ǵ���ʵ�壬ȱ�ٵ��ֶ�int��Ϊ-1��String��Ϊnull] )
	 * @return 
	 * List<RequisitionA> requisitionList (���ϵ��б��������ϵ�����������)
	 */
	public String searchRequisitionList(){
		List<RequisitionA> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_searchRequisitionList_success";
	}
	//1.4
	/**
	 * getRequisitionProductList: �鿴���ϵ���ϸ��Ϣ
	 * @param 
	 * int requisitionId (���ϵ�id)
	 * int requisitionType (���ϵ���� 1��������  2�������Ʒ)
	 * @return 
	 * List<RequisitionProductA> requisitionProductList (���ϵ���Ӧ����Ʒ/���Ʒ��ϸ��Ϣ)
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
