package entity;

import java.math.BigDecimal;

public class ProductSell {
	private int Provider_id;
	private int Materials_id;
	private int ProvideMaterial_period;
	private BigDecimal ProvideMaterial_cost;
	public int getProvider_id() {
		return Provider_id;
	}
	public void setProvider_id(int provider_id) {
		Provider_id = provider_id;
	}
	public int getMaterials_id() {
		return Materials_id;
	}
	public void setMaterials_id(int materials_id) {
		Materials_id = materials_id;
	}
	public int getProvideMaterial_period() {
		return ProvideMaterial_period;
	}
	public void setProvideMaterial_period(int provideMaterial_period) {
		ProvideMaterial_period = provideMaterial_period;
	}
	public BigDecimal getProvideMaterial_cost() {
		return ProvideMaterial_cost;
	}
	public void setProvideMaterial_cost(BigDecimal provideMaterial_cost) {
		ProvideMaterial_cost = provideMaterial_cost;
	}
	
}
