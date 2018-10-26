package com.day6.encapsulation;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		//1.��objΪnull������
		if(obj==null){
			return false;
		}
		//2.ȷ��obj�Ƿ���Dept��Ķ���
		if(!(obj instanceof Dept)){
			return false;//�粻�ǲ��Ŷ���û�бȽϵ�����
		}
		
		//3.��ִ�е��˲���˵��������һ�����Ŷ���
		Dept other =(Dept)obj;
		
		//4.�趨�Ƚϵ�����
		if(this.deptno==other.deptno&&this.dname.equals(other.dname)){
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc
				+ "]";
	}
	
	
}
