package entity;

import java.sql.Date;

public class PurchaseOrder {
	private int Materials_id;
	private int Provider_id;
	private int PurchaseOrder_id;
	private Date PurchaseOrder_beginTime;
	private float PurchaseOrder_totalprice;
	private int PurchaseOrder_amount;
	public int getMaterials_id() {
		return Materials_id;
	}
	public void setMaterials_id(int materials_id) {
		Materials_id = materials_id;
	}
	public int getProvider_id() {
		return Provider_id;
	}
	public void setProvider_id(int provider_id) {
		Provider_id = provider_id;
	}
	public int getPurchaseOrder_id() {
		return PurchaseOrder_id;
	}
	public void setPurchaseOrder_id(int purchaseOrder_id) {
		PurchaseOrder_id = purchaseOrder_id;
	}
	public Date getPurchaseOrder_beginTime() {
		return PurchaseOrder_beginTime;
	}
	public void setPurchaseOrder_beginTime(Date purchaseOrder_beginTime) {
		PurchaseOrder_beginTime = purchaseOrder_beginTime;
	}
	public float getPurchaseOrder_totalprice() {
		return PurchaseOrder_totalprice;
	}
	public void setPurchaseOrder_totalprice(float purchaseOrder_totalprice) {
		PurchaseOrder_totalprice = purchaseOrder_totalprice;
	}
	public int getPurchaseOrder_amount() {
		return PurchaseOrder_amount;
	}
	public void setPurchaseOrder_amount(int purchaseOrder_amount) {
		PurchaseOrder_amount = purchaseOrder_amount;
	}
	
}
