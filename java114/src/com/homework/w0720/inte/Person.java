package com.homework.w0720.inte;

public class Person extends Animal 
				implements IEat,IDrink,IGame,IHappy{
	@Override
	public void happy() {
		System.out.println("��ϲ����");
		
	}

	@Override
	public void game() {
		System.out.println("��ϲ����");
		
	}

	@Override
	public void drink() {
		System.out.println("��ϲ����");
		
	}

	@Override
	public void eat() {
		System.out.println("��ϲ����");
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
