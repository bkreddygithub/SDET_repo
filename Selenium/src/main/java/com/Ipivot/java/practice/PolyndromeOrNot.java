package com.Ipivot.java.practice;

public class PolyndromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2662, reversedInt = 0, remainder, originalInt;
        originalInt = num;
       
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInt = reversedInt * 10 + remainder;
            num  /= 10;
        }
    
        if (originalInt == reversedInt)
            System.out.println(originalInt + " is a palindrome.");
        else
            System.out.println(originalInt + " is not a palindrome.");
    }

	}


