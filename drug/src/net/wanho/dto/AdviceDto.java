package net.wanho.dto;

public class AdviceDto {

	private int drugId;
	private int drugNum;

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public int getDrugNum() {
		return drugNum;
	}

	public void setDrugNum(int drugNum) {
		this.drugNum = drugNum;
	}

	public AdviceDto(int drugId, int drugNum) {
		super();
		this.drugId = drugId;
		this.drugNum = drugNum;
	}

	public AdviceDto() {
		super();
		// TODO Auto-generated constructor stub
	}

}
