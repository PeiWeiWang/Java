package com.wanho.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellerLogProxy implements InvocationHandler {
	//
	Seller seller;
	
    //将厂家（委托方）的实体类传进来，seller就是厂家
	public SellerLogProxy(Seller seller) {
		super();
		this.seller = seller;
	}

    /**
     * proxy代理商
     * method，要执行的方法，传进来是代理商的方法，执行厂家的方法
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("11月11日促销，买10合送2合");
		
		Object result = method.invoke(seller, args);
		if("ad".equals(method.getName())){
		   System.out.println("另外，adidas 小白鞋上市了");
		}

		return result;
	}

}
