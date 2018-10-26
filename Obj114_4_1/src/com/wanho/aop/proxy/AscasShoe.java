package com.wanho.aop.proxy;

public class AscasShoe implements Seller {

	@Override
	public int sell(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public String ad(String info) {
		System.out.println(info);
		return info;
	}

}
