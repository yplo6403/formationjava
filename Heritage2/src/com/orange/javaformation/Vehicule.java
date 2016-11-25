package com.orange.javaformation;

public class Vehicule {
	private final String marque;
	private final String couleur;
	private double vitesse;
	private boolean started;

	public Vehicule(String marque, String couleur) {
		this.marque = marque;
		this.couleur = couleur;
	}

	public void demarrer() {
		started = true;
		System.out.println("D�marrage");
	}

	public void arreter() {
		if (vitesse == 0) {
			started = false;
			System.out.println("Arr�t");
		}
	}

	public void accelerer() {
		if (started) {
			vitesse += 5.0;
			System.out.println("Acc�laration +5 km/h");
		}
	}

	public void freiner() {
		if (vitesse >= 5.0) {
			vitesse -= 5.0;
			System.out.println("D�cel�ration -5 km/h");
		} else {
			vitesse = 0.0;
			System.out.println("Arr�t");
		}
	}

	public String getMarque() {
		return marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public double getVitesse() {
		return vitesse;
	}

	public boolean isStarted() {
		return started;
	}
}
