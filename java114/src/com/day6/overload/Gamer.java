package com.day6.overload;

import com.day6.encapsulation.Person;

public class Gamer {
	
	public void game(){
		
		System.out.println("û����Ϸ�ߣ������Զ���ʾ");
	}
	public void game(String name1){
		System.out.println("1����Ϸ�ߣ�"+name1+"���ڽ�����Ϸ");
	}
	
	//2����Ϸ�ߣ������ֽ��д�ӡ
	public void game(String name1,String name2){
		System.out.print("2����Ϸ�ߣ�"+name1+"���ڽ�����Ϸ,");
		System.out.println(name2+"���ڽ�����Ϸ");
	}
	
	
	//3����Ϸ�ߣ������ֽ��д�ӡ
	public String game(String name1,String name2,String name3){
		System.out.print("3����Ϸ�ߣ�"+name1+"���ڽ�����Ϸ");
		System.out.print(name2+"���ڽ�����Ϸ,");
		System.out.println(name3+"���ڽ�����Ϸ");
		return name2+"��ʤ����";
	}
	
	public static void main(String[] args) {
		Gamer g = new Gamer();
		/*g.game();
		g.game("zs");
		g.game("zs", "ls");*/
		 g.game("zd", "aa", "bb");
		//System.out.println(msg);
		
		
		
		
		
	}
}
