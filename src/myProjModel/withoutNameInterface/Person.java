package myProjModel.withoutNameInterface;

public abstract class Person {

	protected String lastName;
	protected String firstName;
	protected String midName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;

	}

	public String getName() {
		if (midName.isEmpty() || midName.equals("N/A"))
			return lastName + " ," + firstName;

		else
			return lastName + " ," + firstName + " ," + midName;
	}
}
