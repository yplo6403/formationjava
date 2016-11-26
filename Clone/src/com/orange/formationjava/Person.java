package com.orange.formationjava;

public class Person {

	private String mFirstName;
	private String mLastName;
	private Address mAddress;

	public Person(String firstName, String lastName, Address address) {
		setFirstName(firstName);
		setLastName(lastName);
		setAddress(address);
	}

	public String getLastName() {
		return mLastName;
	}

	public void setLastName(String lastName) {
		mLastName = lastName;
	}

	public Address getAddress() {
		return mAddress;
	}

	public void setAddress(Address address) {
		mAddress = address;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public void setFirstName(String firstName) {
		mFirstName = firstName;
	}

	@Override
	public String toString() {
		return "Person [firstName='" + mFirstName + "', lastName='" + mLastName + "', " + mAddress + "]";
	}

}
