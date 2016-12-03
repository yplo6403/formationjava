package com.orange.formationjava.pattern.singleton;

public class ManagerSingleton {

	/** Constructeur priv� */
	private ManagerSingleton() {
		// Initialize
	}

	/** Instance unique non pr�initialis�e : Lazy-loading */
	private volatile static ManagerSingleton sInstance;

	/** Point d'acc�s pour l'instance unique du singleton */
	public static ManagerSingleton getInstance() {
		if (sInstance == null) {
			// synchronisation pour g�rer les acc�s concurrents
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
