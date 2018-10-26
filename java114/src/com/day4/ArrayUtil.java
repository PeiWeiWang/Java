package com.day4;

/**
 * 用于int类型数组的工具类，可以直接使用
 * @author 马老师
 * @version 2018-7-16
 * */
public class ArrayUtil{
	/**
	 * 用于展示数组
	 * @param ia：需要展示的int[]数组
	 * */
	public static void showArray(int[] ia){
		for(int i:ia){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	/**
	 * 获得指定数组中的最大值
	 * @return max：指定数组中的最大元素值
	 * @param ia：要查询最大值的指定数组
	 * */
	public  static  int  getMax(int[] ia){
		int max = ia[0];
		for(int element:ia){
			if(element>max){
				max = element;
			}
		}
		return max;
	}
	
	/**
	 * 获得指定数组中的最小值
	 * @return min：指定数组中的最小元素值
	 * @param ia：要查询最小值的指定数组
	 * */
	public  static  int  getMin(int[] ia){
		int min = ia[0];
		for(int element:ia){
			if(element<min){
				min = element;
			}
		}
		return min;
	}
	
	/**
	 * 对指定数组进行排序
	 * @param ia：要查询最大值的指定数组
	 * */
	public  static  void  sort(int[] ia){
		for(int i=0;i<ia.length-1;i++){//控制总轮次  i代表当前轮数
			for(int j=0;j<ia.length-1-i;j++){
				if(ia[j]>ia[j+1]){//交换位置的前提
					int temp = ia[j];
					 ia[j] = ia[j+1];
					 ia[j+1] = temp;
				}
			
			}
		}
	}
	
	
	
}
