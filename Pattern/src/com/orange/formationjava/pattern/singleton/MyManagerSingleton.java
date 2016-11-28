package com.orange.formationjava.pattern.singleton;

/**
 * Implémentation simple d'un singleton. L'instance est créée à
 * l'initialisation.
 */
public class MyManagerSingleton {

	/** Constructeur privé */
	private MyManagerSingleton() {
	}

	/** Instance unique pré-initialisée */
	private static MyManagerSingleton sMyManagerSingleton = new MyManagerSingleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static MyManagerSingleton getInstance() {
		return sMyManagerSingleton;
	}
}
