package com.orange.formationjava;

public class Address {
	private String mStreet;
	private String mCity;
	private String mState;

	public Address(String street, String city, String state) {
		setStreet(street);
		setCity(city);
		setState(state);
	}

	@Override
	public String toString() {
		return "Address [Street='" + mStreet + "', City='" + mCity + "', State='" + mState + "']";
	}

	public String getCity() {
		return mCity;
	}

	public void setCity(String city) {
		mCity = city;
	}

	public String getStreet() {
		return mStreet;
	}

	public void setStreet(String street) {
		mStreet = street;
	}

	public String getState() {
		return mState;
	}

	public void setState(String state) {
		mState = state;
	}
	
}
