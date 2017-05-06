package basedao.dao;

import java.util.List;

import basedao.BaseDao;
import entity.Category;

public interface CategoryDao extends BaseDao<Category> 
{
	public List<Category> findCategoryList();//返回货品目录列表

}
