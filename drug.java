package com.example.floatingtest;

public class drug{
	private rxtermsProperties rxtermsProperties;

	public rxtermsProperties getRXTermProperties()
	{
		return rxtermsProperties;
	}
	
	@Override
	public String toString(){
		return rxtermsProperties.toString();
	}
	
}
