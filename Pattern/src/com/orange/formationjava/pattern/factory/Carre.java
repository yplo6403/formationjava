package com.orange.formationjava.pattern.factory;

public class Carre implements Shape {

	private final int mCote;

	public Carre(int cote) {
		mCote = cote;
	}

	@Override
	public void draw() {
		System.out.println("Draw carre cote=" + mCote);
	}

}
