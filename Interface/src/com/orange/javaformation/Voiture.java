package com.orange.javaformation;

public class Voiture implements Demarrable {
	private final String marque;
	private boolean started;

	public Voiture(String marque) {
		this.marque = marque;
	}

	@Override
	public void demarrer() {
		started = true;
	}

	@Override
	public void arreter() {
		started = false;
	}

	public String getMarque() {
		return marque;
	}

	@Override
	public boolean isStarted() {
		return started;
	}

	
}
