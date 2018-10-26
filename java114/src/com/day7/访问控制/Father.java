package com.day7.访问控制;

public class Father {
	private String privateX ="私有的";
	String defaultX ="包访问控制";
	protected String protectedX = "受保护的";
	public String publicX= "公共的";
	
	
	public void test(){
		System.out.println(privateX);
		System.out.println(defaultX);
		System.out.println(protectedX);
		System.out.println(publicX);
	}
}
