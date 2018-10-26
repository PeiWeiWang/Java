package com.homework.w0725;

import java.util.*;

import util.DateUtil;

import com.entity.Emp;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(7369,"SMITH","CLERK",7902,	
				DateUtil.StringToDateNew("1980/12/17"),900.0,null,20));
		emps.add(new Emp(7566,"JONES","MANAGER",7839,	
				DateUtil.StringToDateNew("1980/12/17"),3200.0,null,20));
		emps.add(new Emp(7788,"SCOTT","MANAGER",7566,	
				DateUtil.StringToDateNew("1980/12/17"),3100.0,null,20));
		//找出3000以上
		for(Emp e:emps){
			if(e.getSal()>3000){
				System.out.println(e);
			}
		}
		
		//找出JONES的下属
		int empno = 0;
		
		Iterator<Emp> it = emps.iterator();
		while(it.hasNext()){
			Emp emp = it.next();
			if("JONES".equals(emp.getEname())){
				empno = emp.getEmpno();
			}
		}
		
		
		for(int i =0;i<emps.size();i++){
			Emp emp = emps.get(i);
			if(emp.getMgr().equals(empno)){
				System.out.println(emp);
			}
		}*/
		List<String> ts  = new ArrayList<>();
		ts.add("adc");
		ts.add("afk");
		ts.add("abb");
		ts.add("bdc");
		ts.add("cba");
		
		for(int i = 0;i<ts.size()-1;i++){//总轮数
			for(int j = 0;j<ts.size()-1-i;j++){//每轮比较的次数
				if(ts.get(j).compareTo(ts.get(j+1))>0){
					String temp =  ts.get(j);
					ts.set(j, ts.get(j+1));
					ts.set(j+1, temp);
				}
			}
		}
		
		
		for(String e:ts){
			System.out.println(e);
		}
	}

}
