package com.Ipivot.java.practice;

public class DuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Bhargavii";
		 int len = name.length();
		  char[] nameCharArray = name.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < len; i++) {
			  for (int j = i + 1; j < len; j++) {
				  if (nameCharArray[i] == nameCharArray[j]) {
					  System.out.println(nameCharArray[j]);
					  break;
				  }

			  }
		  }
	}
}