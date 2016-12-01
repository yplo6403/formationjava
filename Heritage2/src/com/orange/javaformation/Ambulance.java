package com.orange.javaformation;

public class Ambulance extends Voiture {

	private boolean mGyrophareStarted;

	public Ambulance(String marque, String modele, String couleur, int nbPortes) {
		super(marque, modele, couleur, nbPortes);
	}

	@Override
	public void demarrer() {
		super.demarrer();
		mGyrophareStarted = true;
		System.out.println("Démarrage avec gyrophare");
	}

	public void demarrer(boolean gyrophareStarted) {
		mGyrophareStarted = gyrophareStarted;
		super.demarrer();
		if (gyrophareStarted) {
			System.out.println("Démarrage avec gyrophare");
		}
	}

	@Override
	public void arreter() {
		super.arreter();
		mGyrophareStarted = false;
	}

	public boolean isGyrophareStarted() {
		return mGyrophareStarted;
	}

	public static void main(String[] args) {
		Ambulance ambulance = new Ambulance("Citroen", "C5", "Blanc", 5);
		ambulance.demarrer();
		ambulance.accelerer();
		ambulance.freiner();
		ambulance.freiner();
	}

}
