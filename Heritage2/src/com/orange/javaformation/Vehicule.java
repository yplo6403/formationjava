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
	}

	public void arreter() {
		if (vitesse == 0) {
			started = false;
		}
	}

	public void accelerer() {
		if (started) {
			vitesse += 5.0;
		}
	}

	public void freiner() {
		if (vitesse >= 5.0) {
			vitesse -= 5.0;
		} else {
			vitesse = 0.0;
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
