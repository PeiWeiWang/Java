package com.day6.overload;

import com.day6.encapsulation.Person;

public class Gamer {
	
	public void game(){
		
		System.out.println("没有游戏者，电脑自动演示");
	}
	public void game(String name1){
		System.out.println("1个游戏者，"+name1+"正在进行游戏");
	}
	
	//2个游戏者，将名字进行打印
	public void game(String name1,String name2){
		System.out.print("2个游戏者，"+name1+"正在进行游戏,");
		System.out.println(name2+"正在进行游戏");
	}
	
	
	//3个游戏者，将名字进行打印
	public String game(String name1,String name2,String name3){
		System.out.print("3个游戏者，"+name1+"正在进行游戏");
		System.out.print(name2+"正在进行游戏,");
		System.out.println(name3+"正在进行游戏");
		return name2+"是胜利者";
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
