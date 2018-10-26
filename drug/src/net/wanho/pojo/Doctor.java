package net.wanho.pojo;

public class Doctor {
	private int id;
	private String doctorName;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Doctor(int id, String doctorName, String password) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.password = password;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
