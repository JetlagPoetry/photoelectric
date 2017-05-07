package com.Dao.impl;

import java.util.List;

import com.Dao.entity.Materials;
import com.Dao.itf.MaterialsDao;

public class MaterialsDaoImpl extends BaseDaoImpl<Materials> implements MaterialsDao {

	@Override
	public List<Materials> findMaterialsByOtsID(int otsID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materials> findMaterialsByOtsName(String otsName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materials> findMaterialsByWipID(int wipID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materials> findMaterialsByWipName(String wipName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addMaterialsForOts(int otsID, int materialID, int material_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMaterialsForOts(int otsID, int materialID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMaterialsForOts(int otsID, int materialID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addMaterialsForWip(int wipID, int materialID, int material_amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMaterialsForWip(int wipID, int materialID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateMaterialsForWip(int wipID, int materialID) {
		// TODO Auto-generated method stub
		return false;
	}

}
