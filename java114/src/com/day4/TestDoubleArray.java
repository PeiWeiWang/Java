package com.day4;

public class TestDoubleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//javaû�ж�ά���飬ֻ��������ΪԪ�ص�����
		//��ά����ľ�̬��ʼ��
//		int[][] da = {{1,2,3},{3,4,5},{2,6}};
//		System.out.println(da.length);
		
		//��ά����Ķ�̬��ʼ��
		//�ȳ�ʼ����ά�ģ���ȷ���м��У�
//		int[][] da = new int[3][];
//		//�ڳ�ʼ����ά�ģ���ȷ��ÿ���м�����Ԫ��
//		da[0] = new int[6];
//		da[1] = new int[5];
//		da[2] = new int[3];
		
//		//ͬʱ��ʼ��
//		int[][] da = new int[3][5];
//		da[0][2] = 10;
//		da[1][1] = 22;
//		
//		//��ά����ı�����
//		for(int[] ia:da){
//			for(int i :ia){
//				System.out.print(i+"\t");
//			}
//			System.out.println();
//		}
		
		//����һ��String  dsa ���͵Ķ�ά����  ��Ϊ4
		//��һ�� 5����Ԫ��
		//��2�� 3����Ԫ��
		//��3�� 6����Ԫ��
		//��4�� 5����Ԫ��
		
		//��  dsa[0][1] = "aa";dsa[1][2] = "bb";dsa[2][3] = "cc";
		//������������
		
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
