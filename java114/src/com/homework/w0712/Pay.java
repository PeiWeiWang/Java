package com.homework.w0712;

public class Pay {

	/**
	 *���벹ȫ��ALT+/
	 */
	public static void main(String[] args) {
		/*shirtPrice��T���۸񣩣�shoePrice������Ь�۸񣩣�
		padshoePrice�������ļ۸񣩡�
		��Ʒ������shirtNo��T����������shoeNo������Ь��������
		padNo����������������*/
		
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double padshoePrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;//�ۿ�
		double finalPad =(shirtPrice*shirtNo+shoePrice*shoeNo
									+padshoePrice*padNo)*discount;
		double returnMoney = 1500-finalPad;
		
		System.out.println("\t\t\t\t��ӭʹ�ù������ϵͳ\n\n");
		System.out.println("****************���ѵ�******************");
		System.out.println("������Ʒ\t\t����\t����\t���");
		System.out.println("T��\t\t"+shirtPrice+"\t"+shirtNo+"\t"+shirtPrice*shirtNo);
		System.out.println("��Ь\t\t"+shoePrice+"\t"+shoeNo+"\t"+shoePrice*shoeNo);
		
	}

}
