package entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Order {
	private int Order_id;
	private Timestamp Order_beginTime;
	private Timestamp Order_endTime;
	private int Order_dealPersonID;
	private BigDecimal Order_totalPrice;
	private int Order_status;
	private String Order_notes;
	private String Order_buyer;
	private String Order_buyerContact;
	private String Order_buyerRepresantName;
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public Timestamp getOrder_beginTime() {
		return Order_beginTime;
	}
	public void setOrder_beginTime(Timestamp order_beginTime) {
		Order_beginTime = order_beginTime;
	}
	public Timestamp getOrder_endTime() {
		return Order_endTime;
	}
	public void setOrder_endTime(Timestamp order_endTime) {
		Order_endTime = order_endTime;
	}
	public int getOrder_dealPersonID() {
		return Order_dealPersonID;
	}
	public void setOrder_dealPersonID(int order_dealPersonID) {
		Order_dealPersonID = order_dealPersonID;
	}
	public BigDecimal getOrder_totalPrice() {
		return Order_totalPrice;
	}
	public void setOrder_totalPrice(BigDecimal order_totalPrice) {
		Order_totalPrice = order_totalPrice;
	}
	public int getOrder_status() {
		return Order_status;
	}
	public void setOrder_status(int order_status) {
		Order_status = order_status;
	}
	public String getOrder_notes() {
		return Order_notes;
	}
	public void setOrder_notes(String order_notes) {
		Order_notes = order_notes;
	}
	public String getOrder_buyer() {
		return Order_buyer;
	}
	public void setOrder_buyer(String order_buyer) {
		Order_buyer = order_buyer;
	}
	public String getOrder_buyerContact() {
		return Order_buyerContact;
	}
	public void setOrder_buyerContact(String order_buyerContact) {
		Order_buyerContact = order_buyerContact;
	}
	public String getOrder_buyerRepresantName() {
		return Order_buyerRepresantName;
	}
	public void setOrder_buyerRepresantName(String order_buyerRepresantName) {
		Order_buyerRepresantName = order_buyerRepresantName;
	}
	
}
