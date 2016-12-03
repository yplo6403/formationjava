package com.orange.formationjava;

import java.util.HashMap;
import java.util.Map;

public enum Langage {

	JAVA(1), CPP(10), PHP(20);

	private final int mValue;

	// A map to save relation between value and enum instance
	private static Map<Integer, Langage> mValueToEnum = new HashMap<>();

	// Initialize map statically.
	static {
		for (Langage entry : Langage.values()) {
			mValueToEnum.put(entry.toInt(), entry);
		}
	}

	private Langage(int value) {
		mValue = value;
	}

	/**
	 * Converts a Language enum into its corresponding value
	 * @return
	 */
	public int toInt() {
		return mValue;
	}

	/**
	 * Converts an int value into a Language enumerated
	 * @param value
	 *            the value representing the Language
	 * @return Langage instance
	 */
	public static Langage valueOf(int value) {
		Langage entry = mValueToEnum.get(value);
		if (entry != null) {
			return entry;
		}
		throw new IllegalArgumentException("No enum const class " + Langage.class.getName() + "." + value);
	}
}
