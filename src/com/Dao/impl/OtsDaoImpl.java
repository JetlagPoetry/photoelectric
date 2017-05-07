package com.Dao.impl;

import java.util.List;

import com.Dao.entity.Ots;
import com.Dao.itf.OtsDao;

public class OtsDaoImpl extends BaseDaoImpl<Ots> implements OtsDao {

	@Override
	public List<Ots> findOtsListByName(String OtsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ots> findOtsListByCategory(String categoryName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ots> findOtsListByCategory(int categoryID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addOts(Ots newOts, int categoryID) {
		// TODO Auto-generated method stub
		return false;
	}

}
