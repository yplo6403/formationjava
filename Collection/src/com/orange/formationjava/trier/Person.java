package com.orange.formationjava.trier;

public class Person implements Comparable<Person> {

	private final String mFirstName;
	private final String mLastName;
	private Integer mAge;

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

	public Integer getAge() {
		return mAge;
	}

	public void setAge(int age) {
		mAge = age;
	}

	@Override
	public String toString() {
		return "Person [prénom='" + mFirstName + "', nom='" + mLastName + ", age=" + mAge + "]";
	}

	@Override
	public int compareTo(Person other) {
		// Comparaison sur le nom
		int compareNom = mLastName.compareTo(other.mLastName);
		if (compareNom == 0)  {
			// Si égalité sur le nom: comparaison sur le prénom
			return mFirstName.compareTo(other.mFirstName);
		}
		return compareNom;
	}


}
