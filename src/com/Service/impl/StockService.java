package com.Service.impl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.entity.Allocation;
import com.Dao.impl.AllocationDaoImpl;
import com.Dao.impl.MaterialsStockManageDaoImpl;
import com.Dao.impl.OtsStockManageImpl;
import com.Dao.impl.RepositoryDaoImpl;
import com.Dao.impl.WipStockManageDaoImpl;
import com.Dao.itf.AllocationDao;
import com.Dao.itf.MaterialsStockManageDao;
import com.Dao.itf.OtsStockManageDao;
import com.Dao.itf.RepositoryDao;
import com.Dao.itf.WipStockManageDao;


public class StockService {
	private RepositoryDao repositoryDao=new RepositoryDaoImpl();
	private AllocationDao allocationdao=new AllocationDaoImpl();
	private OtsStockManageDao otsStockManagedao=new OtsStockManageImpl();
	private WipStockManageDao wipStockManagedao=new WipStockManageDaoImpl();
	private MaterialsStockManageDao materialsStockManage=new MaterialsStockManageDaoImpl();
	//�����Ҫ��Щ������п��԰���������ʽ��Ӷ�Ӧ�ı�
	 boolean fillStockForm(StockForm stockForm)
	 {
		 return true;
	 }
	 ArrayList<StockForm> getStockOutList()
	 {
		 ArrayList<StockForm> list=new ArrayList<StockForm>();
		 return list; 
	 }
	 List<StockForm> getStockOutListByName(String objectName)
	 {
		 ArrayList<StockForm> list=new ArrayList<StockForm>();
		 return list; 
	 }
	 ArrayList<StockForm> getStockInList()
	 {
		 ArrayList<StockForm> list=new ArrayList<StockForm>();
		 return list; 
	 }
	 List<StockForm> getStockInListByName(String objectName)
	 {
		 ArrayList<StockForm> list=new ArrayList<StockForm>();
		 return list; 
	 }
	 StockForm getStockFormByID(int id)
	 {
		 StockForm stockform=new StockForm();
		 return stockform; 
	 }
	 StockForm getStockOutFormByR(Requisition requisition)
	 {
		 StockForm stockform=new StockForm();
		 return stockform; 
	 }
	 boolean updateStockForm(StockForm stockForm)
	 {
		return true; 
	 }
	 List<Allocation> getRemainProductAllocationByID(int productId,String type,int StockId)
	 {
		ArrayList<Allocation> list =new ArrayList<Allocation>();
		return list;
	 }
	 List<Allocation> getRemainProductAllocationByName(String productName,String type,int StockId)
	 {
		ArrayList<Allocation> list =new ArrayList<Allocation>();
		return list;
	 }
	 List<Allocation> getRemainProduct(String type,int StockId)
	 {
		ArrayList<Allocation> list =new ArrayList<Allocation>();
		return list;
	 }
	 List<Counter> getAllCounterInfo()
	 {
		 ArrayList<Counter> list=new ArrayList<Counter>();
	     return list;
	 }
	 List<Counter> getUnoccupiedCounter(int StockId)
	 {
		 List<Counter>list=new ArrayList<Counter>();
		 return list;
	 }
	 List<Counter> getAllCounterInfoInStock(int StockId)
	 {
		 List<Counter>list=new ArrayList<Counter>();
		 return list;
	 }
	 List<StockForm> getLog()
	 {
		 ArrayList<StockForm>list=new ArrayList<StockForm>();
		 return list;
	 }
	 boolean changeCounterInfo(Counter counter)
	 {
		 return true;
	 }
	 boolean changeAllocationInfo(Allocation allocation)
	 {
		 return true;
	 }
	 OrderForm checkRemainOtsForOrder(int orderID)
	 {
		 OrderForm orderForm =new OrderForm();
		 return orderForm;
	 }
	 List<Ots>getOrderOtsOts_ID(int oderID)
	 {
		 ArrayList<Ots> list = new ArrayList<Ots>();
		 return list;
	 }
}
