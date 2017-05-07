package com.Dao.itf;

import java.util.List;

import com.Dao.entity.Category;



public interface CategoryDao extends BaseDao<Category> 
{
	public List<Category> findCategoryList();//返回货品目录列表

}
