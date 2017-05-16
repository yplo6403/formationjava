package com.orange.formationjava.generic;

import java.util.Date;

public class TestDuo {

	public static void main(String[] args) {
		Duo duo1 = new Duo(1, "Un");
		System.out.println(duo1);
		Integer first1 = duo1.getFirst();
		String second1 = duo1.getSecond();
		System.out.println("First= '" + first1 + "' second= '" + second1 + "'");

		System.out.println("-------------------------------------");

		Duo duo2 = new Duo("date", new Date());
		System.out.println(duo2);
		String first2 = duo2.getFirst();
		Date second2 = duo2.getSecond();
		System.out.println("First= '" + first2 + "' second= '" + second2 + "'");
	}
}
