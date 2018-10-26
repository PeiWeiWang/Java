package com.homework.w0720.inte;

public class Person extends Animal 
				implements IEat,IDrink,IGame,IHappy{
	@Override
	public void happy() {
		System.out.println("ÈËÏ²»¶ÀÖ");
		
	}

	@Override
	public void game() {
		System.out.println("ÈËÏ²»¶Íæ");
		
	}

	@Override
	public void drink() {
		System.out.println("ÈËÏ²»¶ºÈ");
		
	}

	@Override
	public void eat() {
		System.out.println("ÈËÏ²»¶³Ô");
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
