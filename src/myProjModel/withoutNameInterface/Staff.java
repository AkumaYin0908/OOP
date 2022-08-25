package myProjModel.withoutNameInterface;

public class Staff extends Person {

	private int staffID;
	private String position;
	private boolean isEmployed;

	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

	public int getStaffID() {
		return staffID;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setIsEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}

	public boolean getIsEmployed() {
		return isEmployed;
	}

}
