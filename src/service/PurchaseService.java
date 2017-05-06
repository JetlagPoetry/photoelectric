package service;

import java.util.ArrayList;
import java.util.List;

import basedao.dao.MaterialsDao;
import basedao.dao.ProvideMaterialPeriodDao;
import basedao.dao.ProviderDao;
import basedao.dao.PurchaseOrderDao;
import basedao.dao.impl.MaterialsDaoImpl;
import basedao.dao.impl.ProvideMaterialPeriodDaoImpl;
import basedao.dao.impl.ProviderDaoImpl;
import basedao.dao.impl.PurchaseOrderDaoImpl;
import entity.Provider;
import entity.PurchaseOrder;
import entity.materials.Materials;
public class PurchaseService {
private ProviderDao privoderDao=new ProviderDaoImpl();
private ProvideMaterialPeriodDao privoderMaterialPeriodDao=new ProvideMaterialPeriodDaoImpl();
private MaterialsDao MaterialDao=new MaterialsDaoImpl();
private PurchaseOrderDao purchaseOrderDao=new PurchaseOrderDaoImpl();
//�漰����Dao �������Щ�������ʹ�ù�����ȱ����һ�����Ӧ��Dao  �����Լ��ӣ����ָ�ʽΪ ����+Dao  name =New ����+Dao+Impl();
	
 List<PurchaseOrder> getPuchaseOrderList()
 {
	 ArrayList<PurchaseOrder>list =new ArrayList<PurchaseOrder>();
	 return list;
	 
 }
  PurchaseOrder getPurchaseOrderByID()
  {
	  PurchaseOrder order=new PurchaseOrder();
	  return order;
  }
  List<PurchaseOrder> getPuchaseOrderByStatus(int statusID)
  {
 	 ArrayList<PurchaseOrder>list =new ArrayList<PurchaseOrder>();
 	 return list;
 	 
  }
  PurchaseOrder getPurchaseOrderInfo(int purchaseID)
  {
	  PurchaseOrder order=new PurchaseOrder();
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
