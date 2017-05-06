package entity;

public class Allocation {
	private int Allocation_id;
	private int Repository_id;
	private int Allocation_stockNo;
	private int Allocation_isOccupied;
	public int getAllocation_id() {
		return Allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		Allocation_id = allocation_id;
	}
	public int getRepository_id() {
		return Repository_id;
	}
	public void setRepository_id(int repository_id) {
		Repository_id = repository_id;
	}
	public int getAllocation_stockNo() {
		return Allocation_stockNo;
	}
	public void setAllocation_stockNo(int allocation_stockNo) {
		Allocation_stockNo = allocation_stockNo;
	}
	public int getAllocation_isOccupied() {
		return Allocation_isOccupied;
	}
	public void setAllocation_isOccupied(int allocation_isOccupied) {
		Allocation_isOccupied = allocation_isOccupied;
	}
	
}
