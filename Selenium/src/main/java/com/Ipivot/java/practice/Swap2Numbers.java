package com.Ipivot.java.practice;

public class Swap2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		 a = a + b; 
	     b = a - b; 
	     a = a - b; 
	        System.out.println("After swaping: a = " + a + ", b = " + b); 
		

}
}