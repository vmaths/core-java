package com.vmstate.accessmodifiers;
/**
 * public visibility means this method can be accessed anywhere in the program as long as you have an instance of this class to call it from
 * 
 * private visibility means that this method can not be accessed anywhere other than inside of this class
 * 
 * protected visibility means that this method can be only be accessed inside of this package,and from subclasses of this class
 * 
 * 
 * default visibility means that this method can only be accessed inside of this package
 * 
 * @author Rajesh Abraham
 *
 */
public class ExampleForAccessModifiers 

{
	public void sampleForPublic()
	{
		
	}
	
	private void sampleForPrivate()
	{
		
	}
	
		protected void sampleForProtecetd()
	{
		
	}
	
	void sampleForDefault()
	{
		
	}
}
