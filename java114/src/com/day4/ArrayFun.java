package com.day4;

import java.util.Arrays;

public class ArrayFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int[] ia = {2,1,4,7,6,3}; 
		System.out.println(ia);//数组的内存
		System.out.println(ia.length);*/
		//System.out.println(ia[ia.length]);// java.lang.ArrayIndexOutOfBoundsException:数组下标越界
		
		
		
		//一.数组的遍历--将数组中的元素一个一个的取出来，进行操作
			//1.while
		/*	int index = 0;
			while(index<=ia.length){
				System.out.print(ia[index]+"\t");
				index++;
			}
		*/
			//2.for
			
		/*	//3.ForEach---专门用于遍历数组和列表
			for(int element:ia){
				System.out.print(element+"\t");
			}*/
		
		
		//找出以上数组中的最大和最小值
	/*	int[] ia = {2,1,4,7,6,3}; 
		int max= ia[0];
		for(int element:ia){
			if(element>max){
				max = element;
			}
		}
		System.out.println("最大值为"+max);*/

		//给予一个数字，判断其在数组中是否存在，如存在，找出此数的下标
		/*int[] ia = {2,1,4,7,6,3};
		int num = 4;
		int index = -1;//默认这个数字不存在
		for(int i = 0;i<ia.length;i++){
			if(ia[i]==num){
				index = i;
			}
		}
		
		System.out.println(index);*/
		
		//逆序
	/*	int[] ia = {2,1,4,7,6,3};
		
		for(int i=0;i<(ia.length/2);i++){//换位次数：长度的一半次数即可
			int temp = ia[i];
			ia[i] = ia[ia.length-1-i];
			ia[ia.length-1-i] = temp;
		}
		for(int element:ia){
			System.out.print(element+"\t");
		}*/
		
		//排序:冒泡
		/*int[] ia = {66,99,521,88,77,64,101,76};
		for(int i=0;i<ia.length-1;i++){//控制总轮次  i代表当前轮数
			System.out.println("当前为第"+i+"轮");
			//控制控制的每轮中比较的次数，--每轮比较的次数是依次递减的--
			for(int j=0;j<ia.length-1-i;j++){
				if(ia[j]>ia[j+1]){//交换位置的前提
					int temp = ia[j];
					 ia[j] = ia[j+1];
					 ia[j+1] = temp;
				}
			for(int num :ia){
				System.out.print(num+"\t");
			}
			System.out.println();
			}
			System.out.println();
		}*/
		int[] ia = {66,99,521,88,77,64,101,76};
		ArrayUtil.sort(ia);
		ArrayUtil.showArray(ia);
		System.out.println(ia.length);
		
		
		
	}

}
