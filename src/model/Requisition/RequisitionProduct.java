package model.Requisition;

public class RequisitionProduct {
	private int    product_id;          //���ϻ���Ʒid
	private String product_name;        //���ϻ���Ʒ����
	private int    product_quantity;    //��Ʒ����Ʒ����
	private String product_location;    //��Ʒ����Ʒλ��
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_location() {
		return product_location;
	}
	public void setProduct_location(String product_location) {
		this.product_location = product_location;
	}
	
}
