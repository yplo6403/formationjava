package com.orange.javaformation;

public class Voiture extends Vehicule {
	private final String mModele;
	private final int mNbPortes;

	public Voiture(String marque, String modele, String couleur, int nbPortes) {
		super(marque, couleur);
		mModele = modele;
		mNbPortes = nbPortes;
	}

	public String getModele() {
		return mModele;
	}

	public int getNbPortes() {
		return mNbPortes;
	}

}