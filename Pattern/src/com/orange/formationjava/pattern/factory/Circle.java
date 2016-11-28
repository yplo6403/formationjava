package com.orange.formationjava.pattern.factory;

public class Circle implements Shape {

	private final int mRayon;

	public Circle(int rayon) {
		mRayon = rayon;
	}

	@Override
	public void draw() {
		System.out.println("Draw cercle rayon=" + mRayon);
	}

}
