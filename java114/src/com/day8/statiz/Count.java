package com.day8.statiz;
//ͳ��һ�����������ٸ�Count��Ķ���
public class Count {
	private static int count=0;//�����˶��ٸ�����,static���α�ʾ���ж�����
	
	public Count(){
		count++;//����һ������,��Ҫ����һ�ι��췽��
	}
	//�������޸�,ֻ���ܻ�ȡ
	public static int getCount() {
		return count;
	}
	
	
}
