package com.orange.formationjava.trier.treeset;

public class Person {

	private String mFirstName;
	private String mLastName;

	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}

	public String getLastName() {
		return mLastName;
	}

	public void setLastName(String lastName) {
		mLastName = lastName;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public void setFirstName(String firstName) {
		mFirstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName='" + mFirstName + "', lastName='" + mLastName + "]";
	}

}
