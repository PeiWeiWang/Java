package com.day4;

import java.util.Arrays;

public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] da = {2.0,9.0,1.1,4,2.6};
		Arrays.sort(da);//排序
		System.out.println(Arrays.toString(da));//将数组中的元素转为字符串形式
		
		//copyOf:指定的新长度高与原数组的长度，多余的元素使用初始值填充；
		//如新长度低于原数组的长，按新长度进行截取
		double[] da1 = Arrays.copyOf(da, 10);
		System.out.println(Arrays.toString(da1));
		double[] da2 = Arrays.copyOf(da, 3);
		System.out.println(Arrays.toString(da2));
		
		//copyOfRange： 将指定数组的指定范围复制到一个新数组。--左闭右开--
		double[] da3 = Arrays.copyOfRange(da, 2, 4);
		System.out.println(Arrays.toString(da3));
		double[] da4 = Arrays.copyOfRange(da, 2, 10);
		System.out.println(Arrays.toString(da4));
		
		
		//equals：比较两个数组中的元素的顺序、类型、值是否相同
		double[] da5 = Arrays.copyOfRange(da, 2, 4);
		double[] da6 = Arrays.copyOfRange(da, 2, 4);
		System.out.println(da5==da6);//比较的是内存地址  false
		System.out.println(Arrays.equals(da5, da6));//比较数组的内容
	}

}
