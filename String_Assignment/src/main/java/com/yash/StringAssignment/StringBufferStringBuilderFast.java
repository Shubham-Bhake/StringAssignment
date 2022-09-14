package com.yash.StringAssignment;

public class StringBufferStringBuilderFast {
	
	  public static void main(String[] args) {
		
//		StringBufferStringBuilderFast SB1= new StringBufferStringBuilderFast();
//		
//		SB1.StringBuilderDemo();
//  	    SB1.StringBufferDemo();
//		
//	}
//	
//	private void StringBuilderDemo() {
//		// TODO Auto-generated method stub
//		long Stime=System.currentTimeMillis();
//		StringBuilder Sbuilder=new StringBuilder();
//		for(int i=0; i<1000;i++) {
//			Sbuilder.append(i);
//			Sbuilder.append("");
//			Sbuilder.append(i);
//			Sbuilder.append("");
//			Sbuilder.append(i);
//			Sbuilder.append("");
//			Sbuilder.append(i);
//			Sbuilder.append("");
//			Sbuilder.append(i);
//			
//		}
//		System.out.println("TimetakenByStringBuilder:"+((System.currentTimeMillis())-Stime));
//	}
//
//	private void StringBufferDemo() {
//		// TODO Auto-generated method stub
//		long Sbtime=System.currentTimeMillis();
//		StringBuffer Sbuffer =new StringBuffer();
//		for(int i=0; i<1000;i++) {
//			Sbuffer.append(i);
//			Sbuffer.append("");
//			Sbuffer.append(i);
//			Sbuffer.append("");
//			Sbuffer.append(i);
//			Sbuffer.append("");
//			Sbuffer.append(i);
//			Sbuffer.append("");
//			Sbuffer.append(i);
//			
//		}
//		System.out.println("TimetakenByStringBuffer:"+((System.currentTimeMillis())-Sbtime));
//	}
		  
		  long startTime = System.nanoTime();
	        System.out.println("startTime="+startTime);
	        StringBuffer sb=new StringBuffer();
	        sb.append('S');
	        long stopTime = System.nanoTime();
	        System.out.println("stopTime="+stopTime);
	        System.out.println("String buffer time Required="+(stopTime-startTime));
	        
	        long startTime1 = System.nanoTime();
	        StringBuilder sbuilder=new StringBuilder();
	        sbuilder.append('A');
	        long stopTime1 = System.nanoTime();
	        System.out.println("stopTime="+stopTime1);
	        System.out.println("String Buildler time Required="+(stopTime1-startTime1));	
	  }
		
	}




