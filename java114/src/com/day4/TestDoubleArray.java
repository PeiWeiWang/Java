package com.day4;

public class TestDoubleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//java没有多维数组，只有以数组为元素的数组
		//二维数组的静态初始化
//		int[][] da = {{1,2,3},{3,4,5},{2,6}};
//		System.out.println(da.length);
		
		//二维数组的动态初始化
		//先初始化高维的（先确定有几行）
//		int[][] da = new int[3][];
//		//在初始化低维的（再确定每行有几个单元格）
//		da[0] = new int[6];
//		da[1] = new int[5];
//		da[2] = new int[3];
		
//		//同时初始化
//		int[][] da = new int[3][5];
//		da[0][2] = 10;
//		da[1][1] = 22;
//		
//		//二维数组的遍历：
//		for(int[] ia:da){
//			for(int i :ia){
//				System.out.print(i+"\t");
//			}
//			System.out.println();
//		}
		
		//定义一个String  dsa 类型的二维数组  行为4
		//第一行 5个单元格
		//第2行 3个单元格
		//第3行 6个单元格
		//第4行 5个单元格
		
		//给  dsa[0][1] = "aa";dsa[1][2] = "bb";dsa[2][3] = "cc";
		//遍历以上数组
		
		String[][]  dsa = new String[4][];
		dsa[0] = new String[5];
		dsa[1] = new String[3];
		dsa[2] = new String[6];
		dsa[3] = new String[5];
		dsa[0][1] = "aa";
		dsa[1][2] = "bb";	
		dsa[2][3] = "cc";		
		dsa[3][6] = "cc";	
		//dsa[4][5] = "cc";	
		System.out.println(dsa.length);
		for(String[] sa:dsa){
			for(String str:sa){
				System.out.print(str+"\t");
			}
			System.out.print("\n");
		}
		
	}

}
