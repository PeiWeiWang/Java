package com.day3;

public class TestExit {

	/**
	 *continue:跳过本轮循环中，continue以下的语句（不执行）；进入下一轮循环
	 *break:结束当前循环；循环不进入下一轮
	 *return:返回并结束方法，结束当前方法
	 *System.exit(0):无条件退出JVM
	 */
	public static void main(String[] args) {
	/*	for(int i =1;i<=10;i++){
			System.out.println("continue前"+i);//不受影响
			if(i==5){
				continue;
			}
			System.out.println("continue后"+i+"\n");
		}
		System.out.println("-----循环外-----");*/
		
		/*for(int i =1;true;i++){
			System.out.println("break前"+i);//不受影响
			if(i==5){
				break;
			}
			System.out.println("break后"+i+"\n");
		}
		System.out.println("-----循环外-----");//不受影响
	*/
		/*
		for(int i =1;i<10;i++){
			System.out.println("break前"+i);//不受影响
			if(i==5){
				return;
			}
			System.out.println("break后"+i+"\n");
		}
		System.out.println("-----循环外-----");*/
		
		/*for(int i =1;i<10;i++){
			System.out.println("break前"+i);//受影响
			if(i==5){
				System.exit(0);
			}
			System.out.println("break后"+i+"\n");
		}
		System.out.println("-----循环外-----");*/
		
	/*out:for(int i =1;i<=10;i++){
			for(int j =1;j<=10;j++){
				if(j==5){
					break out;//退出内层循环
				}
				System.out.println(i+"+"+j);
			}
			System.out.println();
		}
	*/
		/*boolean flag = true;
		while(flag){
			for(int i =10;i>=1;i--){
				if(i==5){
					flag = false;
					break;
				}
				System.out.println(i);
			}
			System.out.println();
		}*/
		
		
	}
}
