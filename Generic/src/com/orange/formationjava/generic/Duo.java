package com.orange.formationjava.generic;

public class Duo {

	private Object mFirst;
	private Object mSecond;
	
	public Duo(Object first, Object second) {
		mFirst = first;
		mSecond = second;
	}
		
	public Object getFirst() {
		return mFirst;
	}
	
	public Object getSecond() {
		return mSecond;
	}

	@Override
	public String toString() {
		return "Duo [First=" + mFirst + ", Second=" + mSecond + "]";
	}
}
