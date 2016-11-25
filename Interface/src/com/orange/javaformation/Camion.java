package com.orange.javaformation;

public class Camion implements Demarrable {

	private boolean started;

	private final Chronotachygraphe mChronotachygraphe;

	public Camion() {
		mChronotachygraphe = new Chronotachygraphe();
	}

	@Override
	public void demarrer() {
		started = true;
		mChronotachygraphe.demarrer();
	}

	@Override
	public void arreter() {
		started = false;
		mChronotachygraphe.arreter();
	}

	@Override
	public boolean isStarted() {
		return started;
	}

}
