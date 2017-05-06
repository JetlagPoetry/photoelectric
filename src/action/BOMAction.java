package action;

import java.util.List;
import java.util.Map;

import model.BOM.*;

public class BOMAction extends SuperAction {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 前台传过来的参数
	 */
	// 1.1 （无）
	// 1.2
	private String Goods_name;
	// 1.3
	private int Wip_id;
	// 1.4
	private String goods_name;
	// 1.5
    private Goods goods;
    private List<Wip> wipList;
	// 1.6
    private int Goods_id;
	// 1.7 （与1.5相同）
	// 1.8 （无）
	// 1.9
    private Wip	wip;
    private List<Material> materialList;
	// 1.10 （与1.9相同）
	// 1.11
    private int wip_id;
	// 1.12
    private String wip_name;
	// 1.13 （无）
	// 1.14
    private Material Material;
	// 1.15 （与1.14相同）
	// 1.16
    private int MaterialID;
	// 1.17
    private String material_name;
	// 1.18 （无）
	// 1.19
    private Category Category;
	// 1.20 （与1.19相同）
	// 1.21
    private int CategoryID;
	// 1.22
	private String category_name;
	
	/**
	 * getters和setters
	 */
	
	/**
	 * actions
	 */
	// 1.1
	public String getGoodsTree(){
		Map<String, List<Goods>> result = null;
		
		session.setAttribute("GoodsTree", result);
		return "BOM_getGoodsTree_success";
	}
	// 1.2
	public String getWipListByGoodsName(){
		List<WipInGoods> result = null;
		
		session.setAttribute("WipList", result);
		return "BOM_getWipListByGoodsName_success";
	}
	// 1.3
	public String getMaterialListByWipId(){
		List<MaterialInWip> result = null;
		
		session.setAttribute("MaterialList", result);
		return "BOM_getMaterialListByWipId_success";
	}
	// 1.4
	public String searchGoodsByName(){
		int result = -1;
		
		session.setAttribute("goods_id", result);
		return "BOM_searchGoodsByName_success";
	}
	// 1.5
	public String addGoods(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_addGoods_success";
	}
	// 1.6
	public String deleteGoods(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_deleteGoods_success";
	}
	// 1.7
	public String modifyGoods(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_modifyGoods_success";
	}
	// 1.8
	public String getAllWipList(){
		List<Wip> result = null;
		
		session.setAttribute("WipList", result);
		return "BOM_getAllWipList_success";
	}
	// 1.9
	public String addWip(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_addWip_success";
	}
	// 1.10
	public String modifyWip(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_modifyWip_success";
	}
	// 1.11
	public String deleteWip(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_deleteWip_success";
	}
	// 1.12
	public String searchWipByName(){
		int result = -1;
		
		session.setAttribute("wip_id", result);
		return "BOM_searchWipByName_success";
	}
	// 1.13
	public String getAllMaterialList(){
		List<Material> result = null;
		
		session.setAttribute("MaterialList", result);
		return "BOM_getAllMaterialList_success";
	}
	// 1.14
	public String addMaterial(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_addMaterial_success";
	}
	// 1.15
	public String modifyMaterial(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_modifyMaterial_success";
	}
	// 1.16
	public String BOM_deleteMaterial(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_deleteMaterial_success";
	}
	// 1.17
	public String searchMaterialByName(){
		int result = -1;
		
		session.setAttribute("material_id", result);
		return "BOM_searchMaterialByName_success";
	}
	// 1.18
	public String getAllCategoryList(){
		List<Category> result = null;
		
		session.setAttribute("CategoryList", result);
		return "BOM_getAllCategoryList_success";
	}
	// 1.19
	public String addCategory(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_addCategory_success";
	}
	// 1.20
	public String modifyCategory(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_modifyCategory_success";
	}
	// 1.21
	public String deleteCategory(){
		Boolean result = null;
		
		session.setAttribute("Success", result);
		return "BOM_deleteCategory_success";
	}
	// 1.22
	public String searchCategoryByName(){
		int result = -1;
		
		session.setAttribute("category _id", result);
		return "BOM_searchCategoryByName_success";
	}
}
