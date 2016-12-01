package com.orange.javaformation;

public class Vehicule {
	private final String mMarque;
	private final String mCouleur;
	private double mVitesse;
	private boolean mStarted;

	public Vehicule(String marque, String couleur) {
		mMarque = marque;
		mCouleur = couleur;
	}

	public void demarrer() {
		mStarted = true;
		System.out.println("Démarrage");
	}

	public void arreter() {
		if (mVitesse == 0) {
			mStarted = false;
			System.out.println("Arrêt");
		}
	}

	public void accelerer() {
		if (mStarted) {
			mVitesse += 5.0;
			System.out.println("Accélaration +5 km/h");
		}
	}

	public void freiner() {
		if (mVitesse >= 5.0) {
			mVitesse -= 5.0;
			System.out.println("Décelération -5 km/h");
		} else {
			mVitesse = 0.0;
			System.out.println("Arrêt");
		}
	}

	public String getMarque() {
		return mMarque;
	}

	public String getCouleur() {
		return mCouleur;
	}

	public double getVitesse() {
		return mVitesse;
	}

	public boolean isStarted() {
		return mStarted;
	}
}
