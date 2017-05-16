package com.orange.formationjava.generic;

public class TestDuo {

	public static void main(String[] args) {
		Duo duo1 = new Duo(1, "Un");
		Integer first1 = duo1.getFirst();
		String second1 = duo1.getSecond();
		System.out.println("First= '" + first1 + "' second= '" + second1 + "'");
		Duo duo2 = new Duo("duo", duo2);
		String first2 = duo2.getFirst();
		Duo second2 = duo2.getSecond();
		System.out.println("First= '" + first2 + "' second= '" + second2 + "'");
	}
}
