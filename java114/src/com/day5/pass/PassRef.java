package com.day5.pass;



public class PassRef {
	int x ; 
	public static void change(PassRef obj) 
	  { 
		obj.x=3; 
	  } 
	 
	  public static void main(String [] args) 
	  { 
	    PassRef obj = new PassRef(); 
	    obj.x = 5; 
	    change(obj); 
	    System.out.println(obj.x); 
	  } 
	 
}
