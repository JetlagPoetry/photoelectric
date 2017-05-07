package com.Action;

import java.util.List;
import java.util.Map;

import com.Action.entity.BOM.*;

/**
 * @author rushzhou
 *
 */
public class BOMAction extends SuperAction {

	private static final long serialVersionUID = 1L;
	
	
	/* parameters from front end */
	// 1.1 （无）
	// 1.2
	private String goodsName;
	// 1.3
	private int wipId;
	// 1.4 （与1.5相同）
	// 1.5
    private GoodsA goods;             
    private List<WipInGoodsA> wipList;
	// 1.6
    private int goodsId;
	// 1.7 （与1.5相同）
	// 1.8 （无）
	// 1.9
    private WipA wip;
    private List<MaterialInWipA> materialList; 
	// 1.10 （与1.9相同）
	// 1.11 （与1.3相同）
	// 1.12 （与1.9相同）
	// 1.13 （无）
	// 1.14
    private MaterialA material;
	// 1.15 （与1.14相同）
	// 1.16
    private int materialId;
	// 1.17
    private String materialName;
	// 1.18 （无）
	// 1.19
    private String categoryName;
	// 1.20 （与1.19相同）
	// 1.21
    private int categoryId;
	// 1.22 （与1.19相同）
	
	/* actions */
	// 1.1
	/**
	 * getGoodsTree: 获取货品信息中的货品树状图分类
	 * @param 
	 * 无
	 * @return 
	 * Map<String, List<GoodsA>> goodsTree (所有的货品类别[String]以及其对应的货品[List<GoodsA>])
	 */
	public String getGoodsTree(){
		Map<String, List<GoodsA>> result = null;
		
		session.setAttribute("goodsTree", result);
		return "BOM_getGoodsTree_success";
	}
	// 1.2
	/**
	 * getWipListByGoodsName: 获取货品信息中的半成品信息
	 * @param
	 * String goodsName (货品名称)
	 * @return
	 * List<WipInGoodsA> wipList (该货品对应的半成品列表)
	 */
	public String getWipListByGoodsName(){
		List<WipInGoodsA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_getWipListByGoodsName_success";
	}
	// 1.3
	/**
	 * getMaterialListByWipId: 获取半成品信息中的物料信息
	 * @param
	 * int wipId (半成品的id)
	 * @return
	 * List<MaterialInWipA> materialList (该半成品对应的物料列表)
	 */
	public String getMaterialListByWipId(){
		List<MaterialInWipA> result = null;
		
		session.setAttribute("materialList", result);
		return "BOM_getMaterialListByWipId_success";
	}
	// 1.4
	@Deprecated
	/**
	 * searchGoodsByName: 货品信息中按货品名称搜索货品
	 * @param
	 * String goodsName (货品名称)
	 * @return
	 * int goodsId (货品id)
	 *
	 */
	public String searchGoodsByName(){
		int result = -1;
		
		session.setAttribute("goodsId", result);
		return "BOM_searchGoodsByName_success";
	}
	/**
	 * searchGoods: 搜索货品
	 * @param
	 * GoodsA goods (货品实体)
	 * @return
	 * List<GoodsA> goodsList (符合条件的货品列表)
	 *
	 */
	public String searchGoods(){
		List<GoodsA> result = null;
		
		session.setAttribute("goodsList", result);
		return "BOM_searchGoods_success";
	}
	// 1.5
	/**
	 * addGoods: 新增货品
	 * @param
	 * GoodsA goods (货品对象)           
     * List<WipInGoodsA> wipList (货品所需半成品列表 [请使用“new WipInGoodsA(int wipId, int wipBom)”构造器] )
	 * @return
	 * Boolean success (新增货品是否成功)
	 */
	public String addGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addGoods_success";
	}
	// 1.6
	/**
	 * deleteGoods: 删除货品
	 * @param
	 * int goodsId (货品id)
	 * @return
	 * Boolean success (删除货品是否成功)
	 */
	public String deleteGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteGoods_success";
	}
	// 1.7
	/**
	 * modifyGoods: 修改货品
	 * @param
	 * GoodsA goods (货品对象)           
     * List<WipInGoodsA> wipList (货品所需半成品列表 [请使用“new WipInGoodsA(int wipId, int wipBom)”构造器] )
	 * @return
	 * Boolean success (修改货品是否成功)
	 */
	public String modifyGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyGoods_success";
	}
	// 1.8
	/**
	 * getAllWipList: 获取所有半成品
	 * @param
	 * 无
	 * @return
	 * List<WipA> wipList (所有半成品列表)
	 */
	public String getAllWipList(){
		List<WipA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_getAllWipList_success";
	}
	// 1.9
	/**
	 * addWip: 新增半成品
	 * @param
	 * WipA wip (半成品对象)
     * List<MaterialInWipA> materialList (半成品所需物料列表 [请使用“new MaterialInWipA(int materialId, int materialBom)”构造器] )
	 * @return
	 * Boolean success (新增半成品是否成功)
	 */
	public String addWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addWip_success";
	}
	// 1.10
	/**
	 * modifyWip: 修改半成品
	 * @param
	 * WipA wip (成品对象)
     * List<MaterialInWipA> materialList (半成品所需物料列表 [请使用“new MaterialInWipA(int materialId, int materialBom)”构造器] )
	 * @return
	 * Boolean success (修改半成品是否成功)
	 */
	public String modifyWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyWip_success";
	}
	// 1.11
	/**
	 * deleteWip: 删除半成品
	 * @param
	 * int wipId (半成品id)
	 * @return
	 * Boolean success (删除半成品是否成功)
	 */
	public String deleteWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteWip_success";
	}
	// 1.12
	@Deprecated
	/**
	 * searchWipByName: 按半成品名称搜索半成品
	 * @param
	 * String wipName (半成品名称)
	 * @return
	 * int wipId (半成品id)
	 */
	public String searchWipByName(){
		int result = -1;
		
		session.setAttribute("wipId", result);
		return "BOM_searchWipByName_success";
	}
	/**
	 * searchWip: 搜索半成品
	 * @param
	 * WipA wip (半成品实体)
	 * @return
	 * List<WipA> wipList (符合条件的半成品列表)
	 *
	 */
	public String searchWip(){
		List<WipA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_searchWip_success";
	}
	// 1.13
	/**
	 * getAllMaterialList: 获取所有物料
	 * @param
	 * 无
	 * @return
	 * List<MaterialA> materialList (所有物料列表)
	 */
	public String getAllMaterialList(){
		List<MaterialA> result = null;
		
		session.setAttribute("materialList", result);
		return "BOM_getAllMaterialList_success";
	}
	// 1.14
	/**
	 * addMaterial: 新增物料
	 * @param
	 * MaterialA material (物料对象)
	 * @return
	 * Boolean success (增添物料是否成功)
	 */
	public String addMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addMaterial_success";
	}
	// 1.15
	/**
	 * modifyMaterial: 修改物料
	 * @param
	 * MaterialA material (物料对象)
	 * @return
	 * Boolean success (修改物料是否成功)
	 */
	public String modifyMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyMaterial_success";
	}
	// 1.16
	/**
	 * deleteMaterial: 删除物料
	 * @param
	 * int materialId (物料id)
	 * @return
	 * Boolean success (删除物料是否成功)
	 */
	public String deleteMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteMaterial_success";
	}
	// 1.17
	/**
	 * searchMaterialByName: 按物料名称搜索物料
	 * @param
	 * String materialName (物料名称)
	 * @return
	 * int materialId (物料id)
	 */
	public String searchMaterialByName(){
		int result = -1;
		
		session.setAttribute("materialId", result);
		return "BOM_searchMaterialByName_success";
	}
	// 1.18
	/**
	 * getAllCategoryList: 获取所有货品类别
	 * @param
	 * 无
	 * @return
	 * List<CategoryA> categoryList (货品类别列表)
	 */
	public String getAllCategoryList(){
		List<CategoryA> result = null;
		
		session.setAttribute("categoryList", result);
		return "BOM_getAllCategoryList_success";
	}
	// 1.19
	/**
	 * addCategory: 增加货品类别
	 * @param
	 * String categoryName (类别对象)
	 * @return
	 * Boolean success (增加类别是否成功)
	 */
	public String addCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addCategory_success";
	}
	// 1.20
	/**
	 * modifyCategory: 修改货品类别
	 * @param
	 * String categoryName (类别对象)
	 * @return
	 * Boolean success (修改类别是否成功)
	 */
	public String modifyCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyCategory_success";
	}
	// 1.21
	/**
	 * deleteCategory: 删除货品类别
	 * @param 
	 * int categoryId (类别id)
	 * @return
	 * Boolean success (删除类别是否成功)
	 */
	public String deleteCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteCategory_success";
	}
	// 1.22
	/**
	 * searchCategoryByName: 按货品类别名称搜索货品类别
	 * @param
	 * String categoryName (货品类别名称)
	 * @return
	 * int categoryId (货品类别id)
	 */
	public String searchCategoryByName(){
		int result = -1;
		
		session.setAttribute("categoryId", result);
		return "BOM_searchCategoryByName_success";
	}
	
	/* getters and setters */
    public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getWipId() {
		return wipId;
	}
	public void setWipId(int wipId) {
		this.wipId = wipId;
	}
	public GoodsA getGoods() {
		return goods;
	}
	public void setGoods(GoodsA goods) {
		this.goods = goods;
	}
	public List<WipInGoodsA> getWipList() {
		return wipList;
	}
	public void setWipList(List<WipInGoodsA> wipList) {
		this.wipList = wipList;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public WipA getWip() {
		return wip;
	}
	public void setWip(WipA wip) {
		this.wip = wip;
	}
	public List<MaterialInWipA> getMaterialList() {
		return materialList;
	}
	public void setMaterialList(List<MaterialInWipA> materialList) {
		this.materialList = materialList;
	}
	public MaterialA getMaterial() {
		return material;
	}
	public void setMaterial(MaterialA material) {
		this.material = material;
	}
	public int getMaterialId() {
		return materialId;
	}
	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}
	public String getMaterialName() {
		return materialName;
	}
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
