package entity.ots;

import java.sql.Timestamp;

public class OtsStockManage {
	private int Ots_id;
	private int Allocation_id;
	private int Ots_amount;
	private int Ots_StockDealPersonID;
	private int Ots_takeOtsPersonID;
	private int Ots_bringOtsPersonID;
	private int OtsStockManage_type;
	private String OtsStockmanage_id;
	private Timestamp Ots_Date;
	private int Repository_id;
	public int getOts_id() {
		return Ots_id;
	}
	public void setOts_id(int ots_id) {
		Ots_id = ots_id;
	}
	public int getAllocation_id() {
		return Allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		Allocation_id = allocation_id;
	}
	public int getOts_amount() {
		return Ots_amount;
	}
	public void setOts_amount(int ots_amount) {
		Ots_amount = ots_amount;
	}
	public int getOts_StockDealPersonID() {
		return Ots_StockDealPersonID;
	}
	public void setOts_StockDealPersonID(int ots_StockDealPersonID) {
		Ots_StockDealPersonID = ots_StockDealPersonID;
	}
	public int getOts_takeOtsPersonID() {
		return Ots_takeOtsPersonID;
	}
	public void setOts_takeOtsPersonID(int ots_takeOtsPersonID) {
		Ots_takeOtsPersonID = ots_takeOtsPersonID;
	}
	public int getOts_bringOtsPersonID() {
		return Ots_bringOtsPersonID;
	}
	public void setOts_bringOtsPersonID(int ots_bringOtsPersonID) {
		Ots_bringOtsPersonID = ots_bringOtsPersonID;
	}
	public int getOtsStockManage_type() {
		return OtsStockManage_type;
	}
	public void setOtsStockManage_type(int otsStockManage_type) {
		OtsStockManage_type = otsStockManage_type;
	}
	public String getOtsStockmanage_id() {
		return OtsStockmanage_id;
	}
	public void setOtsStockmanage_id(String otsStockmanage_id) {
		OtsStockmanage_id = otsStockmanage_id;
	}
	public Timestamp getOts_Date() {
		return Ots_Date;
	}
	public void setOts_Date(Timestamp ots_Date) {
		Ots_Date = ots_Date;
	}
	public int getRepository_id() {
		return Repository_id;
	}
	public void setRepository_id(int repository_id) {
		Repository_id = repository_id;
	}
	
}
