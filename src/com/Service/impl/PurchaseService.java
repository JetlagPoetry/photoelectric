package com.Service.impl;

import java.util.ArrayList;
import java.util.List;

import com.Dao.entity.Materials;
import com.Dao.entity.Provider;

import com.Dao.entity.Purchaseorder;
import com.Dao.impl.MaterialsDaoImpl;
import com.Dao.impl.ProvideMaterialPeriodDaoImpl;
import com.Dao.impl.ProviderDaoImpl;
import com.Dao.impl.PurchaseOrderDaoImpl;
import com.Dao.itf.MaterialsDao;
import com.Dao.itf.ProvideMaterialPeriodDao;
import com.Dao.itf.ProviderDao;
import com.Dao.itf.PurchaseOrderDao;
public class PurchaseService {
private ProviderDao privoderDao=new ProviderDaoImpl();
private ProvideMaterialPeriodDao privoderMaterialPeriodDao=new ProvideMaterialPeriodDaoImpl();
private MaterialsDao MaterialDao=new MaterialsDaoImpl();
private PurchaseOrderDao purchaseOrderDao=new PurchaseOrderDaoImpl();
//�漰����Dao �������Щ�������ʹ�ù�����ȱ����һ�����Ӧ��Dao  �����Լ��ӣ����ָ�ʽΪ ����+Dao  name =New ����+Dao+Impl();
	
 List<Purchaseorder> getPuchaseOrderList()
 {
	 ArrayList<Purchaseorder>list =new ArrayList<Purchaseorder>();
	 return list;
	 
 }
  Purchaseorder getPurchaseOrderByID()
  {
	  Purchaseorder order=new Purchaseorder();
	  return order;
  }
  List<Purchaseorder> getPuchaseOrderByStatus(int statusID)
  {
 	 ArrayList<Purchaseorder>list =new ArrayList<Purchaseorder>();
 	 return list;
 	 
  }
  Purchaseorder getPurchaseOrderInfo(int purchaseID)
  {
	  Purchaseorder order=new Purchaseorder();
	  return order;
  }
  boolean addOtsToPurchaseOrder(int purchaseOrderID,int OtsID)
  {
	  return true;
  }
  boolean subOtsFromPurchaseOrder(int purchaseOrderID,int OtsID)
  {
	  return true;
  }
  List<Provider> getProvider(int materialID)
  {
	  ArrayList<Provider>list=new ArrayList<Provider>();
	  return list;
  }
  Provider getProviderInfo(int providerID)
  {
	  Provider provider=new Provider();
	  return provider;
  }
  Provider getProviderByID(int providerID)
  {
	  Provider provider=new Provider();
	  return provider;
  }
  List<Provider>getProviderByMaterialPrice(int materialID,int maxprice,int minprice)
  {
	  ArrayList<Provider>list=new ArrayList<Provider>();
	  return list;
  }
 boolean addProvider(Provider provider)
 {
	return true;
	 
 }
 boolean changeProviderInfo(Provider provider)
 {
	return true;
 }
 List<Provider> getAllProvider()
 {
	  ArrayList<Provider>list=new ArrayList<Provider>();
	  return list;
 }
 List<Materials> getMaterialNum()
 {
	 ArrayList<Materials>list=new ArrayList<Materials>();
	  return list;
 }
 List<Materials>getMaterialsNumByStatus(int statusID)
 {
	 ArrayList<Materials>list=new ArrayList<Materials>();
	  return list;
 }
}
