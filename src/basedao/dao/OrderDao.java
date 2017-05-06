package basedao.dao;

import java.util.Date;
import java.util.List;

import basedao.BaseDao;
import entity.Order;

public interface OrderDao extends BaseDao<Order> 
{
	List<Order> findOrderList();//返回全部订单
	List<Order> findOrderByBuyer(String orderBuyer);//根据购买方查找订�?
	
	Order findOrderByBeginTime(Date beginTime);
	Order findOrderByEndTime(Date endTime);
	Order findOrderByStatus(int statusID);
	
	boolean addOtsToOrder(int orderID,int otsID,int ots_amount);//订单中添加商�?,默认数量1
	boolean deleteOtsFromOrder(int orderID,int ostID);//删除

}
