package com.Action.entity.BOM;

/**
 * @author rushzhou
 *
 */
public class CategoryA {
	private String  categoryName;    //货品类别名字
	private int     categoryId;	  //货品类别ID
	public CategoryA() {
		super();
	}
	public CategoryA(String categoryName, int categoryId) {
		super();
		this.categoryName = categoryName;
		this.categoryId = categoryId;
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
	
	
}
