package com.Ipivot.java.practice;

public class JavaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//You can either reverse as String using StringBuffer reverse() or you can simply use the code logic. 
		
		
		String name = "Bhargavi Kasireddy";
		String reverseName="";
		for (int i=name.length()-1;i>=0;--i)	{
			reverseName = reverseName + name.charAt(i);
		}
		
		System.out.println("Reverse String "+ reverseName);
	}

}
