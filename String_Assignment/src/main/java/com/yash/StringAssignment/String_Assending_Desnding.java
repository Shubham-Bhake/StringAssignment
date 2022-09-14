package com.yash.StringAssignment;

public class String_Assending_Desnding {
	
	public static void main(String[] args) {
	String s= "Technology";
		char[]a= s.toLowerCase().toCharArray();
	
		char temp;
		 for(int i =0;  i< a.length; i++) {
		  for (int j=0;j<a.length; j++) {
			 
			 if(a[i]<a[j]) {
				 temp =a[j];
				 a[j]= a[i];
				 a[i]= temp;
			 }
		 }	 
		 }
	 System.out.println("Assending oreder");
		System.out.println(new String (a));
		
		 for(int i =0;  i< a.length; i++) {
			 
			 for (int j=0;j<a.length; j++) {
				 
				 if(a[i]>a[j]) {
					 temp =a[i];
					 a[i]= a[j];
					 a[j]= temp;
			 }
			 }	 
			 }
		 System.out.println("desending oreder");
			System.out.println(new String (a));
	}
}
