package service;

import java.util.ArrayList;
import java.util.List;

import basedao.dao.OrderDao;
import basedao.dao.impl.OrderDaoImpl;
import entity.Order;


public class OrderService 
{
	OrderDao order = new OrderDaoImpl();

boolean subOrder(int OrderID)
 {
	 return true;
 }
 boolean addOrder(Order order)
 {
	 return true;
 }
 boolean updateOrder(Order order)
 {
	 return true;
 }
 List<Order> getOrderList()
 {
	 ArrayList<Order> list = new ArrayList<Order>();
	 return list;
 }
 Order getOrderByID(int orderID)
 {
	 Order order =new Order();
	 return order;
 }
 Order getOrderByStatus(int statusID)
 {
	 Order order =new Order();
	 return order;
 }
 boolean addOtsToOrder(int orderID,int otsID)
 {
	 return true;
 }
 boolean subOtsFromOrder(int orderID,int otsID)
 {
	 return true;
 }
 
}

