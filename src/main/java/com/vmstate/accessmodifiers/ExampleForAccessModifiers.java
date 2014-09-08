package com.vmstate.accessmodifiers;

public class ExampleForAccessModifiers 
{
	//public visibility means this method can be accessed anywhere in the program 
	//as long as you have an instance of this class to call it from
	
	public void sampleForPublic()
	{
		
	}
	
	//private visibility means that this method can not be accessed anywhere other than inside of this class 
	
	private void sampleForPrivate()
	{
		
	}
	
	//protected visibility means that this method can be only be accessed inside of this package,
	//and from subclasses of this class
	
	protected void sampleForProtecetd()
	{
		
	}
	
	//default visibility means that this method can only be accessed inside of this package
	
	void sampleForDefault()
	{
		
	}
}
