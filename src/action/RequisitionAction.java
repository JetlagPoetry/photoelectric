package action;

import java.util.List;

import model.Requisition.*;

public class RequisitionAction extends SuperAction {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 前台传过来的参数
	 */
	//1.1
	private int order_id;	
	//1.2 （无）
	//1.3
	private Requisition requisition;	
	//1.4
	private int requisition_id;	
	private int requisition_type;	

	/**
	 * getters和setters
	 */
	
	/**
	 * actions
	 */
	//1.1
	public String getRequisitionListByOrderId(){
		List<Requisition> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getRequisitionListByOrderId_success";
	}
	//1.2
	public String getAllUnfinishedRequisitionList(){
		List<Requisition> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_getAllUnfinishedRequisitionList_success";
	}
	//1.3
	public String searchRequisitionList(){
		List<Requisition> result = null;
		
		session.setAttribute("requisitionList", result);
		return "Requisition_searchRequisitionList_success";
	}
	//1.4
	public String getRequisitionProductList(){
		List<RequisitionProduct> result = null;
		
		session.setAttribute("RequisitionProductList", result);
		return "Requisition_getRequisitionProductList_success";
	}
}
