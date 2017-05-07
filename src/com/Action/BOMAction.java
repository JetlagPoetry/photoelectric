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
	// 1.1 ���ޣ�
	// 1.2
	private String goodsName;
	// 1.3
	private int wipId;
	// 1.4 ����1.5��ͬ��
	// 1.5
    private GoodsA goods;             
    private List<WipInGoodsA> wipList;
	// 1.6
    private int goodsId;
	// 1.7 ����1.5��ͬ��
	// 1.8 ���ޣ�
	// 1.9
    private WipA wip;
    private List<MaterialInWipA> materialList; 
	// 1.10 ����1.9��ͬ��
	// 1.11 ����1.3��ͬ��
	// 1.12 ����1.9��ͬ��
	// 1.13 ���ޣ�
	// 1.14
    private MaterialA material;
	// 1.15 ����1.14��ͬ��
	// 1.16
    private int materialId;
	// 1.17
    private String materialName;
	// 1.18 ���ޣ�
	// 1.19
    private String categoryName;
	// 1.20 ����1.19��ͬ��
	// 1.21
    private int categoryId;
	// 1.22 ����1.19��ͬ��
	
	/* actions */
	// 1.1
	/**
	 * getGoodsTree: ��ȡ��Ʒ��Ϣ�еĻ�Ʒ��״ͼ����
	 * @param 
	 * ��
	 * @return 
	 * Map<String, List<GoodsA>> goodsTree (���еĻ�Ʒ���[String]�Լ����Ӧ�Ļ�Ʒ[List<GoodsA>])
	 */
	public String getGoodsTree(){
		Map<String, List<GoodsA>> result = null;
		
		session.setAttribute("goodsTree", result);
		return "BOM_getGoodsTree_success";
	}
	// 1.2
	/**
	 * getWipListByGoodsName: ��ȡ��Ʒ��Ϣ�еİ��Ʒ��Ϣ
	 * @param
	 * String goodsName (��Ʒ����)
	 * @return
	 * List<WipInGoodsA> wipList (�û�Ʒ��Ӧ�İ��Ʒ�б�)
	 */
	public String getWipListByGoodsName(){
		List<WipInGoodsA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_getWipListByGoodsName_success";
	}
	// 1.3
	/**
	 * getMaterialListByWipId: ��ȡ���Ʒ��Ϣ�е�������Ϣ
	 * @param
	 * int wipId (���Ʒ��id)
	 * @return
	 * List<MaterialInWipA> materialList (�ð��Ʒ��Ӧ�������б�)
	 */
	public String getMaterialListByWipId(){
		List<MaterialInWipA> result = null;
		
		session.setAttribute("materialList", result);
		return "BOM_getMaterialListByWipId_success";
	}
	// 1.4
	@Deprecated
	/**
	 * searchGoodsByName: ��Ʒ��Ϣ�а���Ʒ����������Ʒ
	 * @param
	 * String goodsName (��Ʒ����)
	 * @return
	 * int goodsId (��Ʒid)
	 *
	 */
	public String searchGoodsByName(){
		int result = -1;
		
		session.setAttribute("goodsId", result);
		return "BOM_searchGoodsByName_success";
	}
	/**
	 * searchGoods: ������Ʒ
	 * @param
	 * GoodsA goods (��Ʒʵ��)
	 * @return
	 * List<GoodsA> goodsList (���������Ļ�Ʒ�б�)
	 *
	 */
	public String searchGoods(){
		List<GoodsA> result = null;
		
		session.setAttribute("goodsList", result);
		return "BOM_searchGoods_success";
	}
	// 1.5
	/**
	 * addGoods: ������Ʒ
	 * @param
	 * GoodsA goods (��Ʒ����)           
     * List<WipInGoodsA> wipList (��Ʒ������Ʒ�б� [��ʹ�á�new WipInGoodsA(int wipId, int wipBom)��������] )
	 * @return
	 * Boolean success (������Ʒ�Ƿ�ɹ�)
	 */
	public String addGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addGoods_success";
	}
	// 1.6
	/**
	 * deleteGoods: ɾ����Ʒ
	 * @param
	 * int goodsId (��Ʒid)
	 * @return
	 * Boolean success (ɾ����Ʒ�Ƿ�ɹ�)
	 */
	public String deleteGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteGoods_success";
	}
	// 1.7
	/**
	 * modifyGoods: �޸Ļ�Ʒ
	 * @param
	 * GoodsA goods (��Ʒ����)           
     * List<WipInGoodsA> wipList (��Ʒ������Ʒ�б� [��ʹ�á�new WipInGoodsA(int wipId, int wipBom)��������] )
	 * @return
	 * Boolean success (�޸Ļ�Ʒ�Ƿ�ɹ�)
	 */
	public String modifyGoods(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyGoods_success";
	}
	// 1.8
	/**
	 * getAllWipList: ��ȡ���а��Ʒ
	 * @param
	 * ��
	 * @return
	 * List<WipA> wipList (���а��Ʒ�б�)
	 */
	public String getAllWipList(){
		List<WipA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_getAllWipList_success";
	}
	// 1.9
	/**
	 * addWip: �������Ʒ
	 * @param
	 * WipA wip (���Ʒ����)
     * List<MaterialInWipA> materialList (���Ʒ���������б� [��ʹ�á�new MaterialInWipA(int materialId, int materialBom)��������] )
	 * @return
	 * Boolean success (�������Ʒ�Ƿ�ɹ�)
	 */
	public String addWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addWip_success";
	}
	// 1.10
	/**
	 * modifyWip: �޸İ��Ʒ
	 * @param
	 * WipA wip (��Ʒ����)
     * List<MaterialInWipA> materialList (���Ʒ���������б� [��ʹ�á�new MaterialInWipA(int materialId, int materialBom)��������] )
	 * @return
	 * Boolean success (�޸İ��Ʒ�Ƿ�ɹ�)
	 */
	public String modifyWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyWip_success";
	}
	// 1.11
	/**
	 * deleteWip: ɾ�����Ʒ
	 * @param
	 * int wipId (���Ʒid)
	 * @return
	 * Boolean success (ɾ�����Ʒ�Ƿ�ɹ�)
	 */
	public String deleteWip(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteWip_success";
	}
	// 1.12
	@Deprecated
	/**
	 * searchWipByName: �����Ʒ�����������Ʒ
	 * @param
	 * String wipName (���Ʒ����)
	 * @return
	 * int wipId (���Ʒid)
	 */
	public String searchWipByName(){
		int result = -1;
		
		session.setAttribute("wipId", result);
		return "BOM_searchWipByName_success";
	}
	/**
	 * searchWip: �������Ʒ
	 * @param
	 * WipA wip (���Ʒʵ��)
	 * @return
	 * List<WipA> wipList (���������İ��Ʒ�б�)
	 *
	 */
	public String searchWip(){
		List<WipA> result = null;
		
		session.setAttribute("wipList", result);
		return "BOM_searchWip_success";
	}
	// 1.13
	/**
	 * getAllMaterialList: ��ȡ��������
	 * @param
	 * ��
	 * @return
	 * List<MaterialA> materialList (���������б�)
	 */
	public String getAllMaterialList(){
		List<MaterialA> result = null;
		
		session.setAttribute("materialList", result);
		return "BOM_getAllMaterialList_success";
	}
	// 1.14
	/**
	 * addMaterial: ��������
	 * @param
	 * MaterialA material (���϶���)
	 * @return
	 * Boolean success (���������Ƿ�ɹ�)
	 */
	public String addMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addMaterial_success";
	}
	// 1.15
	/**
	 * modifyMaterial: �޸�����
	 * @param
	 * MaterialA material (���϶���)
	 * @return
	 * Boolean success (�޸������Ƿ�ɹ�)
	 */
	public String modifyMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyMaterial_success";
	}
	// 1.16
	/**
	 * deleteMaterial: ɾ������
	 * @param
	 * int materialId (����id)
	 * @return
	 * Boolean success (ɾ�������Ƿ�ɹ�)
	 */
	public String deleteMaterial(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteMaterial_success";
	}
	// 1.17
	/**
	 * searchMaterialByName: ������������������
	 * @param
	 * String materialName (��������)
	 * @return
	 * int materialId (����id)
	 */
	public String searchMaterialByName(){
		int result = -1;
		
		session.setAttribute("materialId", result);
		return "BOM_searchMaterialByName_success";
	}
	// 1.18
	/**
	 * getAllCategoryList: ��ȡ���л�Ʒ���
	 * @param
	 * ��
	 * @return
	 * List<CategoryA> categoryList (��Ʒ����б�)
	 */
	public String getAllCategoryList(){
		List<CategoryA> result = null;
		
		session.setAttribute("categoryList", result);
		return "BOM_getAllCategoryList_success";
	}
	// 1.19
	/**
	 * addCategory: ���ӻ�Ʒ���
	 * @param
	 * String categoryName (������)
	 * @return
	 * Boolean success (��������Ƿ�ɹ�)
	 */
	public String addCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_addCategory_success";
	}
	// 1.20
	/**
	 * modifyCategory: �޸Ļ�Ʒ���
	 * @param
	 * String categoryName (������)
	 * @return
	 * Boolean success (�޸�����Ƿ�ɹ�)
	 */
	public String modifyCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_modifyCategory_success";
	}
	// 1.21
	/**
	 * deleteCategory: ɾ����Ʒ���
	 * @param 
	 * int categoryId (���id)
	 * @return
	 * Boolean success (ɾ������Ƿ�ɹ�)
	 */
	public String deleteCategory(){
		Boolean result = null;
		
		session.setAttribute("success", result);
		return "BOM_deleteCategory_success";
	}
	// 1.22
	/**
	 * searchCategoryByName: ����Ʒ�������������Ʒ���
	 * @param
	 * String categoryName (��Ʒ�������)
	 * @return
	 * int categoryId (��Ʒ���id)
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
