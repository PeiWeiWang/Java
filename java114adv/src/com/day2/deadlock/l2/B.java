package com.day2.deadlock.l2;

public class B 
{ 
	  synchronized void bar(A a) 
	  { 
	      String name=Thread.currentThread().getName(); 
	      System.out.println(name + " ���� B.bar"); 
	      try 
	      { 
	        Thread.sleep(1000); 
	      } 
	      catch(Exception e) 
	      { 
	        System.out.println(e.getMessage()); 
	      } 
	      System.out.println(name + " �������� A.last()"); 
	      a.last(); 
	  } 
	  synchronized void last() 
	  { 
	      System.out.println("inside A.last"); 
	  } 
	} 
