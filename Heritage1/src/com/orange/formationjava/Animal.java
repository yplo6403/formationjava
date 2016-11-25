package com.orange.formationjava;

public abstract class Animal {
	
	private String mName;

	public Animal(String name) {
		mName = name;
	}
	
	public String getName() {
		return mName;
	}

	public abstract String sound();

}
