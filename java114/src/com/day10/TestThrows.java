package com.day10;

import java.io.FileNotFoundException;
import java.text.ParseException;

import com.day10.my.MinusException;
import com.day10.my.Person;
import com.day10.my.StringLengthLimitException;

public class TestThrows {
	
	public static void dev(int num1,int num2) throws MinusException {//throws:�׳��쳣����
		if(num1<0||num2<0){
			throw new MinusException(); //throw:�׳�������쳣���� 
		}else if(num2==0){
			throw new ArithmeticException("����������Ϊ0");
		}
		System.out.println(num1/num2);
	}
	
	public static void main(String[] args) {

	
			/*try {
				dev(11,0);
			} catch (MinusException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		
		Person p = new Person();
		try {
			p.setName("����111111111111");
		} catch (StringLengthLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p.setAge(10);
		System.out.println(p);
		
	}

}
