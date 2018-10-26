package com.wanho.aop.proxy;

import java.lang.reflect.Proxy;

public class Proxyer {

	public static void main(String[] args) {
		 Seller target = new AscisShoe();//����Ŀ�����  
	        //�����������������  
	        Seller proxy = (Seller) Proxy.newProxyInstance(  
	                target.getClass().getClassLoader(),  
	                target.getClass().getInterfaces(), new SellerLogProxy(target));  
	        proxy.sell(400, 20);
	        proxy.ad("tigerϵ�� 6��");

	}

}
