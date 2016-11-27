package com.orange.formationjava.trier;

public class Person {

	private final String mFirstName;
	private final String mLastName;
	private int mAge;

	public Person(String firstName, String lastName, int age) {
		mFirstName = firstName;
		mLastName = lastName;
		mAge = age;
	}

	public String getLastName() {
		return mLastName;
	}

	public String getFirstName() {
		return mFirstName;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int age) {
		mAge = age;
	}

	@Override
	public String toString() {
		return "Person [prénom='" + mFirstName + "', nom='" + mLastName + ", age=" + mAge + "]";
	}

}
