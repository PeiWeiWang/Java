package com.day4;

import java.util.Arrays;

public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] da = {2.0,9.0,1.1,4,2.6};
		Arrays.sort(da);//����
		System.out.println(Arrays.toString(da));//�������е�Ԫ��תΪ�ַ�����ʽ
		
		//copyOf:ָ�����³��ȸ���ԭ����ĳ��ȣ������Ԫ��ʹ�ó�ʼֵ��䣻
		//���³��ȵ���ԭ����ĳ������³��Ƚ��н�ȡ
		double[] da1 = Arrays.copyOf(da, 10);
		System.out.println(Arrays.toString(da1));
		double[] da2 = Arrays.copyOf(da, 3);
		System.out.println(Arrays.toString(da2));
		
		//copyOfRange�� ��ָ�������ָ����Χ���Ƶ�һ�������顣--����ҿ�--
		double[] da3 = Arrays.copyOfRange(da, 2, 4);
		System.out.println(Arrays.toString(da3));
		double[] da4 = Arrays.copyOfRange(da, 2, 10);
		System.out.println(Arrays.toString(da4));
		
		
		//equals���Ƚ����������е�Ԫ�ص�˳�����͡�ֵ�Ƿ���ͬ
		double[] da5 = Arrays.copyOfRange(da, 2, 4);
		double[] da6 = Arrays.copyOfRange(da, 2, 4);
		System.out.println(da5==da6);//�Ƚϵ����ڴ��ַ  false
		System.out.println(Arrays.equals(da5, da6));//�Ƚ����������
	}

}
