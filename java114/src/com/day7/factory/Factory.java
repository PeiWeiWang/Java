package com.day7.factory;
//����ģʽ
public class Factory {
	//�����Ǵ���BaseDao������Ķ���
	public static BaseDao createDao(){
		return new Dao2();
	}
}
