package entity.materials;
//mysql列名有空格?
public class MaterialsStore {
	private int MaterialsStore_RepositoryID;
	private int MaterialsStore_MaterialsID;
	private int MaterialsStore_MaterialsNum;
	public int getMaterialsStore_RepositoryID() {
		return MaterialsStore_RepositoryID;
	}
	public void setMaterialsStore_RepositoryID(int materialsStore_RepositoryID) {
		MaterialsStore_RepositoryID = materialsStore_RepositoryID;
	}
	public int getMaterialsStore_MaterialsID() {
		return MaterialsStore_MaterialsID;
	}
	public void setMaterialsStore_MaterialsID(int materialsStore_MaterialsID) {
		MaterialsStore_MaterialsID = materialsStore_MaterialsID;
	}
	public int getMaterialsStore_MaterialsNum() {
		return MaterialsStore_MaterialsNum;
	}
	public void setMaterialsStore_MaterialsNum(int materialsStore_MaterialsNum) {
		MaterialsStore_MaterialsNum = materialsStore_MaterialsNum;
	}
	
}
