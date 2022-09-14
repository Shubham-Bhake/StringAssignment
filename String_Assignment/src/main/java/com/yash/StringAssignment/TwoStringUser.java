package com.yash.StringAssignment;

public class TwoStringUser {
	
	

public static String insetNewstring(String originalString,String stringToBeInserted,int index ) {
		
		String newString=originalString.substring(0, index + 1)+stringToBeInserted+originalString.substring(index + 1);
				
		return newString;
		
	}
	
	public static void main(String[] args) {
		
		
		String originalString="yashtech";
		String stringToBeInserted = "IT";
		int index =3;
	
		
System.out.println("Original String: "+ originalString);

System.out.println("String to be inserted: "+ stringToBeInserted);
System.out.println("String to be inserted at index: "+ index);

// Insert the String
System.out.println("Modified String: "+ insetNewstring(originalString,stringToBeInserted,index));
	
	}

	
	}


