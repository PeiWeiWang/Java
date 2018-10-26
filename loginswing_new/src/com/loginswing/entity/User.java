package com.loginswing.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private Integer userid;//�û����
	private String username;//�û���
	private String psd;//����
	private String nickname;//�ǳ�
	private Date birthday;//��������
	private String job;//����
	private Integer falseCount=0;//�������
	private Date lastFalseTime;//���һ�γ���ʱ��
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getFalseCount() {
		return falseCount;
	}

	public void setFalseCount(Integer falseCount) {
		this.falseCount = falseCount;
	}



	public Date getLastFalseTime() {
		return lastFalseTime;
	}



	public void setLastFalseTime(Date lastFalseTime) {
		this.lastFalseTime = lastFalseTime;
	}



	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", psd="
				+ psd + ", nickname=" + nickname + ", birthday=" + birthday
				+ ", job=" + job + ", falseCount=" + falseCount
				+ ", lastFalseTime=" + lastFalseTime + "]";
	}

	

	
	
}
