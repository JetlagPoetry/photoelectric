package entity.wip;

import java.sql.Timestamp;

public class WipStockManage {
	private int Wip_id;
	private int Repository_id;
	private int Allocation_id;
	private int Wip_amount;
	private int Wip_StockDealPersonID;
	private int Wip_takePersonID;
	private int WipStockManage_type;
	private int Wip_bringPersonID;
	private String WipStockManage_ID;
	private Timestamp WipStockManage_Date;
	public int getWip_id() {
		return Wip_id;
	}
	public void setWip_id(int wip_id) {
		Wip_id = wip_id;
	}
	public int getRepository_id() {
		return Repository_id;
	}
	public void setRepository_id(int repository_id) {
		Repository_id = repository_id;
	}
	public int getAllocation_id() {
		return Allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		Allocation_id = allocation_id;
	}
	public int getWip_amount() {
		return Wip_amount;
	}
	public void setWip_amount(int wip_amount) {
		Wip_amount = wip_amount;
	}
	public int getWip_StockDealPersonID() {
		return Wip_StockDealPersonID;
	}
	public void setWip_StockDealPersonID(int wip_StockDealPersonID) {
		Wip_StockDealPersonID = wip_StockDealPersonID;
	}
	public int getWip_takePersonID() {
		return Wip_takePersonID;
	}
	public void setWip_takePersonID(int wip_takePersonID) {
		Wip_takePersonID = wip_takePersonID;
	}
	public int getWipStockManage_type() {
		return WipStockManage_type;
	}
	public void setWipStockManage_type(int wipStockManage_type) {
		WipStockManage_type = wipStockManage_type;
	}
	public int getWip_bringPersonID() {
		return Wip_bringPersonID;
	}
	public void setWip_bringPersonID(int wip_bringPersonID) {
		Wip_bringPersonID = wip_bringPersonID;
	}
	public String getWipStockManage_ID() {
		return WipStockManage_ID;
	}
	public void setWipStockManage_ID(String wipStockManage_ID) {
		WipStockManage_ID = wipStockManage_ID;
	}
	public Timestamp getWipStockManage_Date() {
		return WipStockManage_Date;
	}
	public void setWipStockManage_Date(Timestamp wipStockManage_Date) {
		WipStockManage_Date = wipStockManage_Date;
	}
	
}
