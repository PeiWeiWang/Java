package com.day8.inte;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DaoImpl d =  new DaoImpl();
		DaoI dao = d; //= new DaoI();
		dao.add();
		
		DeptDao dd  = d;
		dd.queryDept();
	}

}
