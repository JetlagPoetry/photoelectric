package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

/**
 * Materialsstore generated by hbm2java
 */
public class Materialsstore implements java.io.Serializable {

	private MaterialsstoreId id;
	private Materials materials;
	private Repository repository;
	private Integer materialsStoreMaterialsNum;

	public Materialsstore() {
	}

	public Materialsstore(MaterialsstoreId id) {
		this.id = id;
	}

	public Materialsstore(MaterialsstoreId id, Materials materials, Repository repository,
			Integer materialsStoreMaterialsNum) {
		this.id = id;
		this.materials = materials;
		this.repository = repository;
		this.materialsStoreMaterialsNum = materialsStoreMaterialsNum;
	}

	public MaterialsstoreId getId() {
		return this.id;
	}

	public void setId(MaterialsstoreId id) {
		this.id = id;
	}

	public Materials getMaterials() {
		return this.materials;
	}

	public void setMaterials(Materials materials) {
		this.materials = materials;
	}

	public Repository getRepository() {
		return this.repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Integer getMaterialsStoreMaterialsNum() {
		return this.materialsStoreMaterialsNum;
	}

	public void setMaterialsStoreMaterialsNum(Integer materialsStoreMaterialsNum) {
		this.materialsStoreMaterialsNum = materialsStoreMaterialsNum;
	}

}
