package com.orange.formationjava.pattern.factory;

public class Rectangle implements Shape {

	private final int mLongueur;
	private final int mLargeur;

	public Rectangle(int longueur, int largeur) {
		mLongueur = longueur;
		mLargeur = largeur;
	}

	@Override
	public void draw() {
		System.out.println("Draw rectangle longueur=" + mLongueur + " largeur=" + mLargeur);
	}

}
