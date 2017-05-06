package basedao.dao;

import java.util.List;

import basedao.BaseDao;
import entity.materials.Materials;

public interface MaterialsDao extends BaseDao<Materials> 
{
	List<Materials> findMaterialsByOtsID(int otsID);//根据货品id找到原料
	List<Materials> findMaterialsByOtsName(String otsName);
	
	List<Materials> findMaterialsByWipID(int wipID);//根据半成品id找到原料
	List<Materials> findMaterialsByWipName(String wipName);
	
	boolean addMaterialsForOts(int otsID,int materialID,int material_amount);//给某种货品添加原材料
	boolean deleteMaterialsForOts(int otsID,int materialID);//
	boolean updateMaterialsForOts(int otsID,int materialID);//修改材料
	
	boolean addMaterialsForWip(int wipID,int materialID,int material_amount);//给某种半成品添加原材�?
	boolean deleteMaterialsForWip(int wipID,int materialID);//
	boolean updateMaterialsForWip(int wipID,int materialID);//修改材料

}
