package com.wanho.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SellerLogProxy implements InvocationHandler {
	//
	Seller seller;
	
    //�����ң�ί�з�����ʵ���ഫ������seller���ǳ���
	public SellerLogProxy(Seller seller) {
		super();
		this.seller = seller;
	}

    /**
     * proxy������
     * method��Ҫִ�еķ������������Ǵ����̵ķ�����ִ�г��ҵķ���
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("11��11�մ�������10����2��");
		
		Object result = method.invoke(seller, args);
		if("ad".equals(method.getName())){
		   System.out.println("���⣬adidas С��Ь������");
		}

		return result;
	}

}
