package com.Ipivot.java.practice;

public class JavaIsPrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 33;
        boolean result = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                result = true;
                break;
            }
        }
        if (!result)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
	}

}
