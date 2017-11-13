package com.orange.formationjava;

public enum Langage {

	JAVA(0), CPP(1), PHP(2);

	/**
	 * Constructor
	 * 
	 * @param value
	 *            the value associated to the name for persistence purpose
	 */
	private Langage(int value) {
		// TODO 1 please complete
	}
	
	public int toInt() {
		// TODO 2 please fix and complete
		return ?;
	}

	public static Langage valueOf(int value) {
		// TODO 3 please fix and complete
		return JAVA;
	}
}
