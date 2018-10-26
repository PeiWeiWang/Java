package com.day4;

/**
 * ����int��������Ĺ����࣬����ֱ��ʹ��
 * @author ����ʦ
 * @version 2018-7-16
 * */
public class ArrayUtil{
	/**
	 * ����չʾ����
	 * @param ia����Ҫչʾ��int[]����
	 * */
	public static void showArray(int[] ia){
		for(int i:ia){
			System.out.print(i+"\t");
		}
		System.out.println();
	}
	
	/**
	 * ���ָ�������е����ֵ
	 * @return max��ָ�������е����Ԫ��ֵ
	 * @param ia��Ҫ��ѯ���ֵ��ָ������
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
	 * ���ָ�������е���Сֵ
	 * @return min��ָ�������е���СԪ��ֵ
	 * @param ia��Ҫ��ѯ��Сֵ��ָ������
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
	 * ��ָ�������������
	 * @param ia��Ҫ��ѯ���ֵ��ָ������
	 * */
	public  static  void  sort(int[] ia){
		for(int i=0;i<ia.length-1;i++){//�������ִ�  i����ǰ����
			for(int j=0;j<ia.length-1-i;j++){
				if(ia[j]>ia[j+1]){//����λ�õ�ǰ��
					int temp = ia[j];
					 ia[j] = ia[j+1];
					 ia[j+1] = temp;
				}
			
			}
		}
	}
	
	
	
}
