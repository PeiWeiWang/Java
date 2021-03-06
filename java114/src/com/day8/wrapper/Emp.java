package com.day8.wrapper;
/*员工号 empno
员工名 ename
工种   job
上司的工号  mgr
入职时间  hiredate
工资  sal
奖金  comm
部门号 deptno*/

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private Double sal;
	private Double comm;
	private int deptno;
	
	public Emp(){}
	
	public Emp(int empno,String ename,String job,int mgr,
			String hiredate,Double sal,Double comm,int deptno){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	public int getEmpno(){
		return empno;
	}
	
	public void setEmpno(int empno){
		this.empno = empno;
	}
	
	public String getEname(){
		return ename;
	}
	
	public void setEname(String ename){
		this.ename = ename;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setJob(String job){
		this.job = job;
	}
	
	public int getMgr(){
		return mgr;
	}
	
	public void setMgr(int mgr){
		this.mgr = mgr;
	}
	
	public String getHiredate(){
		return ename;
	}
	
	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	
	public Double getSal(){
		return sal;
	}
	
	public void setSal(Double sal){
		this.sal = sal;
	}
	
	public Double getComm(){
		return comm;
	}
	
	public void setComm(Double comm){
		this.comm = comm;
	}
	
	public int getDeptno(){
		return deptno;
	}
	
	public void setDeptno(int deptno){
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setEmpno(10);
		emp.setEname("zhangs");
		System.out.println(emp.toString());
	}
}
