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
		System.out.println("Démarrage avec gyrophare");
	}

	public void demarrer(boolean gyrophareStarted) {
		this.gyrophareStarted = gyrophareStarted;
		super.demarrer();
		if (gyrophareStarted) {
			System.out.println("Démarrage avec gyrophare");
		}
	}

	@Override
	public void arreter() {
		super.arreter();
		gyrophareStarted = false;
	}

	public boolean isGyrophareStarted() {
		return gyrophareStarted;
	}

	public static void main(String[] args) {
		Ambulance ambulance = new Ambulance("Citroen", "C5", "Blanc", 5);
		ambulance.demarrer();
		ambulance.accelerer();
		ambulance.freiner();
		ambulance.freiner();
	}

}
