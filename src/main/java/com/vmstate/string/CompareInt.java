package com.vmstate.string;

public class CompareInt {

	public static void main(String[] args) {
		
			Integer var1=10;
			Integer var2=10;
		//	int var3=20;
			
	// Integer is a wrapper class, where as int is a primitive data type.
			if(var1==var2) 
			{
				System.out.println("var1==var2 matches.");			
			}
			else
			{
				System.out.println("var1==var2 does not match");
			}
			
			if(var1.equals(var2))
			{
				System.out.println("var1==var2 matches.");	
			}
			else
			{
				System.out.println("var1==var2 does not match");
			}
			System.out.println();
			
			//------------------------------------------
			
			int var3=10;
			int var4=10;
		//	int var3=20;
			
	// Integer is a wrapper class, where as int is a primitive data type.
			if(var3==var4) 
			{
				System.out.println("var3==var4 matches.");			
			}
			else
			{
				System.out.println("var1==var2 does not match");
			}
			
//			if(var1.equals(var2))
//			{
//				System.out.println("var1==var2 matches.");	
//			}
//			else
//			{
//				System.out.println("var1==var2 does not match");
//			}
			System.out.println();


	}

}
