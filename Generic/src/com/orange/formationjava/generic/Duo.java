package com.orange.formationjava.generic;

/**
 * Generic version of the Duo class.
 * 
 * @param <T>
 *            the type of the first item
 * @param <U>
 *            the type of the second item
 */
public class Duo<T, U> {

	private T mFirst;
	private U mSecond;

	/**
	 * The constructor
	 * 
	 * @param first
	 *            the first item of the Duo instance
	 * @param second
	 *            the second item of the Duo instance
	 */
	public Duo(T first, U second) {
		mFirst = first;
		mSecond = second;
	}

	public T getFirst() {
		return mFirst;
	}

	public U getSecond() {
		return mSecond;
	}

	@Override
	public String toString() {
		return "Duo [First=" + mFirst + ", Second=" + mSecond + "]";
	}
}
