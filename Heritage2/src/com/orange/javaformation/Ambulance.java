package com.orange.javaformation;

public class Ambulance extends Voiture {

	private boolean gyrophareStarted;
	
	public Ambulance(String marque, String modele, String couleur, int nbPortes) {
		super(marque, modele, couleur, nbPortes);
	}

	@Override
	public void demarrer() {
		super.demarrer();
		gyrophareStarted = true;
	}

	public void demarrer(boolean gyrophareStarted) {
		super.demarrer();
		this.gyrophareStarted = gyrophareStarted;
	}

	@Override
	public void arreter() {
		super.arreter();
		gyrophareStarted = false;
	}
	
	public boolean isGyrophareStarted() {
		return gyrophareStarted;
	}
	
}
