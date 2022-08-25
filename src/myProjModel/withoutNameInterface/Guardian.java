package myProjModel.withoutNameInterface;

import myProjModel.withoutNameInterface.Place.Address;

public class Guardian extends Person {
	private Student student;
	private Address homeAdd;
	private Address workAdd;
	private String emailAdd;
	private String job;
	private String homeTelNo;
	private String workTelNo;
	private String mobNum;

	public int getStudID() {
		return student.getStudID();
	}

	public int getDocNo() {
		return student.getDocNo();
	}

	public Address getHomeAdd() {
		return homeAdd;
	}

	public void setHomeAdd(Address homeAdd) {
		this.homeAdd = homeAdd;
	}

	public Address getWorkAdd() {
		return workAdd;
	}

	public void setWorkAdd(Address workAdd) {
		this.workAdd = workAdd;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHomeTelNo() {
		return homeTelNo;
	}

	public void setHomeTelNo(String homeTelNo) {
		this.homeTelNo = homeTelNo;
	}

	public String getWorkTelNo() {
		return workTelNo;
	}

	public void setWorkTelNo(String workTelNo) {
		this.workTelNo = workTelNo;
	}

	public String getMobNum() {
		return mobNum;
	}

	public void setMobNum(String mobNum) {
		this.mobNum = mobNum;
	}

}
