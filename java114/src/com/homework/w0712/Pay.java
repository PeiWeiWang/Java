package com.homework.w0712;

public class Pay {

	/**
	 *代码补全：ALT+/
	 */
	public static void main(String[] args) {
		/*shirtPrice（T恤价格），shoePrice（网球鞋价格），
		padshoePrice（网球拍价格）。
		商品数量：shirtNo（T恤数量），shoeNo（网球鞋数量），
		padNo（网球拍数量）。*/
		
		double shirtPrice = 245.0;
		double shoePrice = 570.0;
		double padshoePrice = 320;
		int shirtNo = 2;
		int shoeNo = 1;
		int padNo = 1;
		double discount = 0.8;//折扣
		double finalPad =(shirtPrice*shirtNo+shoePrice*shoeNo
									+padshoePrice*padNo)*discount;
		double returnMoney = 1500-finalPad;
		
		System.out.println("\t\t\t\t欢迎使用购物管理系统\n\n");
		System.out.println("****************消费单******************");
		System.out.println("购买物品\t\t单价\t个数\t金额");
		System.out.println("T恤\t\t"+shirtPrice+"\t"+shirtNo+"\t"+shirtPrice*shirtNo);
		System.out.println("球鞋\t\t"+shoePrice+"\t"+shoeNo+"\t"+shoePrice*shoeNo);
		
	}

}
