package com.wanho.aop.spring;
/**
 * 切面
 * @author wangb
 *
 */
public class SellAspect {
	public void before(){
		System.out.println("11月11日促销，买10合送2合");
	}
	public void after(){
		System.out.println("号外，adidas 小白鞋上市了");
	}

}
