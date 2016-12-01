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
		System.out.println("D�marrage");
	}

	public void arreter() {
		if (mVitesse == 0) {
			mStarted = false;
			System.out.println("Arr�t");
		}
	}

	public void accelerer() {
		if (mStarted) {
			mVitesse += 5.0;
			System.out.println("Acc�laration +5 km/h");
		}
	}

	public void freiner() {
		if (mVitesse >= 5.0) {
			mVitesse -= 5.0;
			System.out.println("D�cel�ration -5 km/h");
		} else {
			mVitesse = 0.0;
			System.out.println("Arr�t");
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
