package com.day4;

public class demo_for {
	public static void main(String[] args) {
		int array[]= {1,23,5,46,786,22,11};
		for(int i =0;i<array.length-1;i++) {
			for(int j =0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
				int temp = array[j+1];
				array[j+1]= array[j];
				array[j]=temp;
					
				}
			}
		}for (int i : array) {
			System.out.println(i);
			
		}
		
	}

}
