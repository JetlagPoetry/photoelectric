package com.Action.entity.Requisition;

/**
 * @author rushzhou
 *
 */
public class RequisitionProductA {
	private int    productId;          //���ϻ���Ʒid
	private String productName;        //���ϻ���Ʒ����
	private int    productQuantity;    //��Ʒ����Ʒ����
	private String productLocation;    //��Ʒ����Ʒλ��
	public RequisitionProductA() {
		super();
	}
	public RequisitionProductA(int productId, String productName, int productQuantity, String productLocation) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productLocation = productLocation;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductLocation() {
		return productLocation;
	}
	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}
	
}
