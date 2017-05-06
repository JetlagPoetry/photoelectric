package entity.materials;

import java.sql.Timestamp;

public class MaterialStockManage {
	private int Materials_id;
	private int Allocation_id;
	private int Materials_amount;
	private int Materials_StockDealPersonID;
	private int Materials_takeMaterialPersonID;
	private int Materials_bringMaterialPersonID;
	private int MaterialsStockManage_type;
	private String MaterialsStockManage_id;
	private Timestamp MaterialsStockManage_Date;
	private int Repository_id;
	public int getMaterials_id() {
		return Materials_id;
	}
	public void setMaterials_id(int materials_id) {
		Materials_id = materials_id;
	}
	public int getAllocation_id() {
		return Allocation_id;
	}
	public void setAllocation_id(int allocation_id) {
		Allocation_id = allocation_id;
	}
	public int getMaterials_amount() {
		return Materials_amount;
	}
	public void setMaterials_amount(int materials_amount) {
		Materials_amount = materials_amount;
	}
	public int getMaterials_StockDealPersonID() {
		return Materials_StockDealPersonID;
	}
	public void setMaterials_StockDealPersonID(int materials_StockDealPersonID) {
		Materials_StockDealPersonID = materials_StockDealPersonID;
	}
	public int getMaterials_takeMaterialPersonID() {
		return Materials_takeMaterialPersonID;
	}
	public void setMaterials_takeMaterialPersonID(int materials_takeMaterialPersonID) {
		Materials_takeMaterialPersonID = materials_takeMaterialPersonID;
	}
	public int getMaterials_bringMaterialPersonID() {
		return Materials_bringMaterialPersonID;
	}
	public void setMaterials_bringMaterialPersonID(int materials_bringMaterialPersonID) {
		Materials_bringMaterialPersonID = materials_bringMaterialPersonID;
	}
	public int getMaterialsStockManage_type() {
		return MaterialsStockManage_type;
	}
	public void setMaterialsStockManage_type(int materialsStockManage_type) {
		MaterialsStockManage_type = materialsStockManage_type;
	}
	public String getMaterialsStockManage_id() {
		return MaterialsStockManage_id;
	}
	public void setMaterialsStockManage_id(String materialsStockManage_id) {
		MaterialsStockManage_id = materialsStockManage_id;
	}
	public Timestamp getMaterialsStockManage_Date() {
		return MaterialsStockManage_Date;
	}
	public void setMaterialsStockManage_Date(Timestamp materialsStockManage_Date) {
		MaterialsStockManage_Date = materialsStockManage_Date;
	}
	public int getRepository_id() {
		return Repository_id;
	}
	public void setRepository_id(int repository_id) {
		Repository_id = repository_id;
	}
	
}
