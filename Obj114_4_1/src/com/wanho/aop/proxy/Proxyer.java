package com.wanho.aop.proxy;

import java.lang.reflect.Proxy;

public class Proxyer {

	public static void main(String[] args) {
		 Seller target = new AscisShoe();//生成目标对象  
	        //接下来创建代理对象  
	        Seller proxy = (Seller) Proxy.newProxyInstance(  
	                target.getClass().getClassLoader(),  
	                target.getClass().getInterfaces(), new SellerLogProxy(target));  
	        proxy.sell(400, 20);
	        proxy.ad("tiger系列 6折");

	}

}
