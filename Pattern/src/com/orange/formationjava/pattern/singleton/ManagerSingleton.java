package com.orange.formationjava.pattern.singleton;

public class ManagerSingleton {

	/** Constructeur privé */
	private ManagerSingleton() {
		// Initialize
	}

	/** Instance unique non préinitialisée : Lazy-loading */
	private volatile static ManagerSingleton sInstance;

	/** Point d'accès pour l'instance unique du singleton */
	public static ManagerSingleton getInstance() {
		if (sInstance == null) {
			// synchronisation pour gérer les accès concurrents
			synchronized (ManagerSingleton.class) {
				// Double-Checked Locking
				if (sInstance == null) {
					sInstance = new ManagerSingleton();
				}
			}
		}
		return sInstance;
	}
}
