package com.Ipivot.java.practice;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Bhar gavi";
		String nospacestr = "";
		
		char[]	charArray = str.toCharArray();
		
		int length = str.length();
		
		for (int i =0; i<length; i++){
			
			if (charArray[i]!=' '){
				nospacestr+= charArray[i];
			}
		}
				
	System.out.println("nospacestr:"+nospacestr);
	
	
}

}
