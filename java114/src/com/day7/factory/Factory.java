package com.day7.factory;
//工厂模式
public class Factory {
	//作用是创建BaseDao的子类的对象
	public static BaseDao createDao(){
		return new Dao2();
	}
}
