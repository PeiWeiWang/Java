package com.day3;

public class TestDoWhlie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ʼ�������������Ͳ�����ѭ��
		/*int i=1;
		while(i<10){
			System.out.println(i);
			i++;
		}*/
		
		//do..whileѭ������ʹ������ѭ����ִ��������Ҳ��ִ������1��
		/*int i1=100;
		do{
			System.out.println(i1);
			i1++;
		}while(i1<10);*/
		
		
		/*int i1=10;
		do{
			System.out.println(i1);
			i1--;
		}while(i1<10);*/
		
		int num  =100;
		do{
			int unit = num%10;
			int ten = num/10%10;
			int hum = num/100;
			int temp = unit*unit*unit+ten*ten*ten+hum*hum*hum;
			if(temp==num){
				System.out.println(num+"��ˮ�ɻ���");
			}
			num++;
		}while(num<=999);
	}

}
