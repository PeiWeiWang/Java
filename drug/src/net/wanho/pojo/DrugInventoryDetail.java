package net.wanho.pojo;

public class DrugInventoryDetail {

	private int id;
	private String drugName;
	private int drugNum;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public int getDrugNum() {
		return drugNum;
	}
	public void setDrugNum(int drugNum) {
		this.drugNum = drugNum;
	}
	public DrugInventoryDetail(int id, String drugName, int drugNum) {
		super();
		this.id = id;
		this.drugName = drugName;
		this.drugNum = drugNum;
	}
	public DrugInventoryDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
