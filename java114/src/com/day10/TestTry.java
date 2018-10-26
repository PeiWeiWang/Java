package com.day10;

import java.util.Scanner;

public class TestTry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("异常发生前");
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个被除数");
		int num = sc.nextInt();
		try{//尝试运行
			System.out.println("前OK");
			System.out.println(100/num);//可能初选异常的代码
			System.out.println("后OK");
			
			String str = "aaa";// java.lang.NullPointerException
			System.out.println(str.charAt(0));
			
			 str = "a";//java.lang.StringIndexOutOfBoundsException
			System.out.println(str.charAt(1));
		}catch (ArithmeticException e) {//如出现异常,将异常对象进行捕获,赋值给e
			/*//对异常进行处理
			while(num==0){
				System.out.println("重新输入被除数,不能为0");
				num = sc.nextInt();
			}
			System.out.println(100/num);*/
			
			//将出错信息进行控制台的输出
			//e.printStackTrace();
			System.err.println("-----被除数不能为0------");
		}catch (NullPointerException e) {
			System.err.println("-----对象不能为空------");
		}catch(Exception e){
			System.err.println("发生了未知异常");
		}
		
		//发生异常,不会受到影响
		System.out.println("异常发生后");

	}

}
