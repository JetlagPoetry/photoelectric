package com.Dao.entity;
// Generated May 7, 2017 2:26:51 AM by Hibernate Tools 3.6.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Provider generated by hbm2java
 */
public class Provider implements java.io.Serializable {

	private int providerId;
	private String providerName;
	private String providerAddress;
	private String providerContact;
	private Integer providerPeriod;
	private Set<Purchaseorder> purchaseorders = new HashSet<Purchaseorder>(0);
	private Set<ProvidematerialPeriod> providematerialPeriods = new HashSet<ProvidematerialPeriod>(0);

	public Provider() {
	}

	public Provider(int providerId, String providerName, String providerAddress, String providerContact) {
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerAddress = providerAddress;
		this.providerContact = providerContact;
	}

	public Provider(int providerId, String providerName, String providerAddress, String providerContact,
			Integer providerPeriod, Set<Purchaseorder> purchaseorders,
			Set<ProvidematerialPeriod> providematerialPeriods) {
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerAddress = providerAddress;
		this.providerContact = providerContact;
		this.providerPeriod = providerPeriod;
		this.purchaseorders = purchaseorders;
		this.providematerialPeriods = providematerialPeriods;
	}

	public int getProviderId() {
		return this.providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return this.providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderAddress() {
		return this.providerAddress;
	}

	public void setProviderAddress(String providerAddress) {
		this.providerAddress = providerAddress;
	}

	public String getProviderContact() {
		return this.providerContact;
	}

	public void setProviderContact(String providerContact) {
		this.providerContact = providerContact;
	}

	public Integer getProviderPeriod() {
		return this.providerPeriod;
	}

	public void setProviderPeriod(Integer providerPeriod) {
		this.providerPeriod = providerPeriod;
	}

	public Set<Purchaseorder> getPurchaseorders() {
		return this.purchaseorders;
	}

	public void setPurchaseorders(Set<Purchaseorder> purchaseorders) {
		this.purchaseorders = purchaseorders;
	}

	public Set<ProvidematerialPeriod> getProvidematerialPeriods() {
		return this.providematerialPeriods;
	}

	public void setProvidematerialPeriods(Set<ProvidematerialPeriod> providematerialPeriods) {
		this.providematerialPeriods = providematerialPeriods;
	}

}
