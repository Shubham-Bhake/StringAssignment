package com.yash.StringAssignment;

public class GarbageCollectorWork {
	    
	    String st;

	   public GarbageCollectorWork(String st) {
	        this.st = st;
	    }
	    
	    @Override
	    protected void finalize() throws Throwable {
	         System.out.println(this.st + " collected");
	    }
	     
	    public static void main(String[] args) {
	         GarbageCollectorWork gcc = new GarbageCollectorWork("Shubham");
	         System.out.println("String="+gcc.st.toString());
	        gcc=null;
	        System.gc();
	    }



	}
	

