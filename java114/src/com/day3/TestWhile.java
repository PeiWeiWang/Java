package com.day3;

public class TestWhile {

	/**
	 * ѭ���ṹ���ظ���ִ��ͬһ�δ��룬ֱ���ﵽ�趨���˳����� while do...while() for
	 */
	public static void main(String[] args) {
		/*
		 * int i = 1;//1����Ҫ��һ��ѭ���� while (i <= 100) {//2.����ִ�е���������������ҪΪtrue
		 * System.out.println("����ѧ��java,�Ѿ����˵ڡ�"+i+"����");
		 * i++;//3.��ѭ���ӵĲ�����ѭ����Ҫ���޵��������趨���˳����� }
		 */

		/*
		 * int i1 = 100;//1����Ҫ��һ��ѭ���� while (i1>=1) {//2.����ִ�е���������������ҪΪtrue
		 * System.out.println("����ѧ��java,�Ѿ����˵ڡ�"+i+"����");
		 * i--;//3.��ѭ���ӵĲ�����ѭ����Ҫ���޵��������趨���˳����� }
		 */

		// ѭ���ҳ�1-200֮�������
		/*int num = 1;
		
		 * while(num<=20){ System.out.println(num); num+=2; }
		 
		while (num <= 20) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++;
		}

		System.out.println("ѭ�����numΪ" + num);*/
		
		//�ҳ�100-1000֮���ż��
		/*int num = 100;
		while(num<=1000){
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}*/
		
		//�ҳ�100-999֮���ˮ�ɻ���  ��λ��^3+10λ��^3+��λ��^3=������
		/*int num  =100;
		while(num<=999){
			int unit = num%10;
			int ten = num/10%10;
			int hum = num/100;
			int temp = unit*unit*unit+ten*ten*ten+hum*hum*hum;
			if(temp==num){
				System.out.println(num+"��ˮ�ɻ���");
			}
			num++;
		}*/
		
		//�ҳ�100-999֮��Ļ����� 101 111 979
		/*int num  =100;
		while(num<=999){
			int unit = num%10;
			int hum = num/100;
			if(unit==hum){
				System.out.println(num+"�ǻ�����");
			}
			num++;
		}*/
	}

}
