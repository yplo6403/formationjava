package com.orange.formationjava;

public abstract class Animal {
	private String mName;

	public Animal(String name) {
		mName = name;
	}

	public String speak() {
		return mName + " says " + sound();
	}

	public abstract String sound();

}
