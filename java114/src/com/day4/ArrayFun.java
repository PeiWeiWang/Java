package com.day4;

import java.util.Arrays;

public class ArrayFun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int[] ia = {2,1,4,7,6,3}; 
		System.out.println(ia);//������ڴ�
		System.out.println(ia.length);*/
		//System.out.println(ia[ia.length]);// java.lang.ArrayIndexOutOfBoundsException:�����±�Խ��
		
		
		
		//һ.����ı���--�������е�Ԫ��һ��һ����ȡ���������в���
			//1.while
		/*	int index = 0;
			while(index<=ia.length){
				System.out.print(ia[index]+"\t");
				index++;
			}
		*/
			//2.for
			
		/*	//3.ForEach---ר�����ڱ���������б�
			for(int element:ia){
				System.out.print(element+"\t");
			}*/
		
		
		//�ҳ����������е�������Сֵ
	/*	int[] ia = {2,1,4,7,6,3}; 
		int max= ia[0];
		for(int element:ia){
			if(element>max){
				max = element;
			}
		}
		System.out.println("���ֵΪ"+max);*/

		//����һ�����֣��ж������������Ƿ���ڣ�����ڣ��ҳ��������±�
		/*int[] ia = {2,1,4,7,6,3};
		int num = 4;
		int index = -1;//Ĭ��������ֲ�����
		for(int i = 0;i<ia.length;i++){
			if(ia[i]==num){
				index = i;
			}
		}
		
		System.out.println(index);*/
		
		//����
	/*	int[] ia = {2,1,4,7,6,3};
		
		for(int i=0;i<(ia.length/2);i++){//��λ���������ȵ�һ���������
			int temp = ia[i];
			ia[i] = ia[ia.length-1-i];
			ia[ia.length-1-i] = temp;
		}
		for(int element:ia){
			System.out.print(element+"\t");
		}*/
		
		//����:ð��
		/*int[] ia = {66,99,521,88,77,64,101,76};
		for(int i=0;i<ia.length-1;i++){//�������ִ�  i����ǰ����
			System.out.println("��ǰΪ��"+i+"��");
			//���ƿ��Ƶ�ÿ���бȽϵĴ�����--ÿ�ֱȽϵĴ��������εݼ���--
			for(int j=0;j<ia.length-1-i;j++){
				if(ia[j]>ia[j+1]){//����λ�õ�ǰ��
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
