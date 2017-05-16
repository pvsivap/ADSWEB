package com.ads.businessobjects;

import com.ads.businessentities.*;

public class InsuranceTypeBusinessObject implements IInsuranceTypeBusinessObject
{
	//User variable
	private InsuranceType pinsuranceType;
	public InsuranceTypeBusinessObject()
	{
	
	}		
	public InsuranceType Add(InsuranceType insuranceType)
	{
		this.pinsuranceType = insuranceType;
		return insuranceType;	
	}

}

