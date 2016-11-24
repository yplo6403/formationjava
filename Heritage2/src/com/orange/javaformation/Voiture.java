package com.orange.javaformation;

public class Voiture extends Vehicule {
	private final String modele;
	private final int nbPortes;

	public Voiture(String marque, String modele, String couleur, int nbPortes) {
		super(marque, couleur);
		this.modele = modele;
		this.nbPortes = nbPortes;
	}

	public String getModele()  {
		return modele;
	}
	
	public int getNbPortes() {
		return nbPortes;
	}
	

}