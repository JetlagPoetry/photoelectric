package com.Dao.impl;

import java.util.List;

import com.Dao.entity.Wip;
import com.Dao.itf.WipDao;

public class WipDaoImpl extends BaseDaoImpl<Wip> implements WipDao {

	@Override
	public List<Wip> findWipByOtsID(int otsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Wip> findWipByOtsName(String otsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addWipForOts(int otsID, int wipID, int wip_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWipForOts(int otsID, int wipID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateWipForOts(int otsID, int wipID) {
		// TODO Auto-generated method stub
		return false;
	}

}
