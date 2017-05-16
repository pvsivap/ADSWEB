package com.ads.businessobjects;

import com.ads.businessentities.User;

public class UserBusinessObject implements IBusinessObject
{
	//User variable
	private User puser;
	public UserBusinessObject()
	{
	
	}		
	public User Add(User user)
	{
		this.puser = user;
		return user;	
	}

}

