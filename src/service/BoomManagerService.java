package service;

import java.util.ArrayList;
import java.util.List;

import basedao.dao.CategoryDao;
import basedao.dao.MaterialsDao;
import basedao.dao.OtsDao;
import basedao.dao.WipDao;
import basedao.dao.impl.CategoryDaoImpl;
import basedao.dao.impl.MaterialsDaoImpl;
import basedao.dao.impl.OtsDaoImpl;
import basedao.dao.impl.WipDaoImpl;
import entity.Category;
import entity.materials.Materials;
import entity.ots.Ots;
import entity.wip.Wip;

public class BoomManagerService {
	OtsDao ots = new OtsDaoImpl();
	MaterialsDao materialsDAO = new MaterialsDaoImpl();
	WipDao wipDAO = new WipDaoImpl();
	CategoryDao categoryDAO  = new CategoryDaoImpl();

	List<Ots> getOtsByName(String OtsName)
	{
		ArrayList<Ots> list=new ArrayList<Ots>();
		return list;
	}
	Ots getOtsByID(int otsId)
	{
		Ots ots=new Ots();
		return ots;
	}
	List<Category> getOtsCategory()
	{
		ArrayList<Category> list = new ArrayList<Category>();
		
		return list;
	}
	List<Ots> getOtsByCategoryName(String category_Name)
	{
		ArrayList<Ots> list = new ArrayList<Ots>();
		
		return list;
	}
	List<Ots> getOtsByCategoryID(int categoryID)
	{
		ArrayList<Ots> list = new ArrayList<Ots>();
		
		return list;
	}
	boolean newOts(Ots ots)
	{
		return true;
	}
	boolean deleteOts(Ots ots)
	{
		return true;
	}
	boolean updateOts(Ots ots)
	{
		return true;
	}
	boolean addOtsWip(Ots ots,List<Wip> list)
	{
		return true;
	}
	boolean deleteWipFromOts(Ots ots,List<Wip> list)
	{
		return true;
	}
	List<Wip> getWipByOtsID(int ots_id)
	{
		ArrayList<Wip> list =new ArrayList<Wip>();
		return list;
	}
	boolean newWip(Wip wip)
	{
		return true;
	}
	boolean deleteWip(Wip wip)
	{
		return true;
	}
	boolean updateWip()
	{
		return true;
	}
	boolean addWipMaterials(Wip wip,List<Materials> list)
	{
		return true;
	}
	boolean deleteMaterialsFromWip(Wip wip,List<Materials>list)
	{
		return true;
	}
	List<Materials> getMaterialsByWipID(int wip_id)
	{
		List<Materials> list=new ArrayList<Materials>();
		return list;
	}
	List<Materials> getMaterialsByName(String MaterialName)
	{
		List<Materials> list=new ArrayList<Materials>();
		return list;
	}
	boolean newMaterials(Materials materials)
	{
		return true;
	}
	boolean deleteMaterials(Materials materials)
	{
		return true;
	}
	boolean updateMaterials(Materials materials)
	{
		return true;
	}
	boolean updateCategory(Category category)
	{
		return true;
	}
	boolean newCategory(Category category)
	{
		return true;
	}
	boolean deleteCategory(Category category)
	{
		return true;
	}
	
}

