package com.orange.formationjava.pattern.builder;

public class Utilisateur {
	private final String mFirstName; // required
	private final String mLastName; // required
	private int mAge; // optional
	private String mAddress; // optional

	public Utilisateur(String firstName, String lastName) {
		mFirstName = firstName;
		mLastName = lastName;
	}
	
	public Utilisateur(String firstName, String lastName, int age) {
		this( firstName, lastName);
		mAge = age;
	}
	
	public Utilisateur(String firstName, String lastName, String address) {
		this( firstName, lastName);
		mAddress = address;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public String getLastName() {
		return mLastName;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int age) {
		mAge = age;
	}


	public String getAddress() {
		return mAddress;
	}

	public void setAddress(String address) {
		mAddress = address;
	}

	@Override
	public String toString() {
		return "Utilisateur [FirstName='" + mFirstName + "', LastName='" + mLastName + "', Age=" + mAge + ", Address='"
				+ mAddress + "']";
	}
}
