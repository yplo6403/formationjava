package com.orange.formationjava.pattern.singleton;

/**
 * Impl�mentation simple d'un singleton. L'instance est cr��e �
 * l'initialisation.
 */
public class MyManagerSingleton {

	/** Constructeur priv� */
	private MyManagerSingleton() {
	}

	/** Instance unique pr�-initialis�e */
	private static MyManagerSingleton sMyManagerSingleton = new MyManagerSingleton();

	/** Point d'acc�s pour l'instance unique du singleton */
	public static MyManagerSingleton getInstance() {
		return sMyManagerSingleton;
	}
}
