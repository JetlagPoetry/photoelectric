package com.Dao.itf;

import java.util.List;

import com.Dao.entity.Wip;



public interface WipDao extends BaseDao<Wip> 
{
	List<Wip> findWipByOtsID(int otsID);//根据货品id找到半成品
	List<Wip> findWipByOtsName(String otsName);
	
	boolean addWipForOts(int otsID,int wipID,int wip_amount);//给某种货品添加半成品
	boolean deleteWipForOts(int otsID,int wipID);//
	boolean updateWipForOts(int otsID,int wipID);//修改半成品

}
