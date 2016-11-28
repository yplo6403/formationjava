package com.orange.formationjava.pattern.builder;

public class Utilisateur {
	private final String mFirstName; // required
	private final String mLastName; // required
	private int mAge; // optional
	private String mAddress; // optional

	public Utilisateur(UtilisateurBuilder builder) {
		mFirstName = builder.mFirstName;
		mLastName = builder.mLastName;
		mAge = builder.mAge;
		mAddress = builder.mAddress;
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
	
	public static class UtilisateurBuilder implements Builder {
		private final String mFirstName; // required
		private final String mLastName; // required
		private int mAge; // optional
		private String mAddress; // optional
		
		public UtilisateurBuilder(String firstName, String lastName) {
			mFirstName = firstName;
			mLastName = lastName;
		}
		
		public UtilisateurBuilder addAge(int age) {
			mAge = age;
			return this; 
		}
		
		public UtilisateurBuilder addAdresse(String adresse) {
			mAddress = adresse;
			return this; 
		}

		@Override
		public <T> T build() {
			return (T) new Utilisateur(this);
		}
	}
}
