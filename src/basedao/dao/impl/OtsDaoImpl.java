package basedao.dao.impl;

import java.util.List;

import basedao.BaseDaoImpl;
import basedao.dao.OtsDao;
import entity.ots.Ots;

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
