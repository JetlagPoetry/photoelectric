package com.Dao.impl;

import java.util.Date;
import java.util.List;

import com.Dao.entity.Order;
import com.Dao.itf.OrderDao;

public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao {

	@Override
	public List<Order> findOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findOrderByBuyer(String orderBuyer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderByBeginTime(Date beginTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderByEndTime(Date endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findOrderByStatus(int statusID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOtsToOrder(int orderID, int otsID, int ots_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOtsFromOrder(int orderID, int ostID) {
		// TODO Auto-generated method stub
		return false;
	}

}
