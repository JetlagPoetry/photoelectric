package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

import java.util.Date;

/**
 * Purchaseorder generated by hbm2java
 */
public class Purchaseorder implements java.io.Serializable {

	private Integer purchaseOrderId;
	private Provider provider;
	private Materials materials;
	private Date purchaseOrderBeginTime;
	private Float purchaseOrderTotalprice;
	private Integer purchaseOrderAmount;
	private Integer purchaseOrderStatus;

	public Purchaseorder() {
	}

	public Purchaseorder(Provider provider, Materials materials, Date purchaseOrderBeginTime,
			Float purchaseOrderTotalprice, Integer purchaseOrderAmount, Integer purchaseOrderStatus) {
		this.provider = provider;
		this.materials = materials;
		this.purchaseOrderBeginTime = purchaseOrderBeginTime;
		this.purchaseOrderTotalprice = purchaseOrderTotalprice;
		this.purchaseOrderAmount = purchaseOrderAmount;
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	public Integer getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setPurchaseOrderId(Integer purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Materials getMaterials() {
		return this.materials;
	}

	public void setMaterials(Materials materials) {
		this.materials = materials;
	}

	public Date getPurchaseOrderBeginTime() {
		return this.purchaseOrderBeginTime;
	}

	public void setPurchaseOrderBeginTime(Date purchaseOrderBeginTime) {
		this.purchaseOrderBeginTime = purchaseOrderBeginTime;
	}

	public Float getPurchaseOrderTotalprice() {
		return this.purchaseOrderTotalprice;
	}

	public void setPurchaseOrderTotalprice(Float purchaseOrderTotalprice) {
		this.purchaseOrderTotalprice = purchaseOrderTotalprice;
	}

	public Integer getPurchaseOrderAmount() {
		return this.purchaseOrderAmount;
	}

	public void setPurchaseOrderAmount(Integer purchaseOrderAmount) {
		this.purchaseOrderAmount = purchaseOrderAmount;
	}

	public Integer getPurchaseOrderStatus() {
		return this.purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(Integer purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

}
