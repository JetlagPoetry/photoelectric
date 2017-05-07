package com.Dao.itf;

import java.util.List;

import com.Dao.entity.Ots;



public interface OtsDao extends BaseDao<Ots> 
{
	public List<Ots> findOtsListByName(String OtsName);//根据货品名称返回货品列表

	
	public List<Ots> findOtsListByCategory(String categoryName);//根据目录名字返回货品列表
	public List<Ots> findOtsListByCategory(int categoryID);//根据目录id返回目录下货品
	
	boolean addOts(Ots newOts, int categoryID);//添加货品,附带商品类别

}
