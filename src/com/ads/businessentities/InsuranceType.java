package com.ads.businessentities;

public class InsuranceType 
{
	private int id;
	private String insuranceTypeName;
	/**
	 * @return the firstName
	 */
	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}
