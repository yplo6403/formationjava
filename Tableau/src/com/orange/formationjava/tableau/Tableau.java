package com.orange.formationjava.tableau;

public class Tableau {

	public static void main(String[] args) {
		// Tableau de types primitifs
		int[] tableauInt;
		tableauInt = new int[3];
		displayTablePrimitif(tableauInt);
		tableauInt[0] = 1;
		tableauInt[1] = 2;
		tableauInt[2] = 3;
		displayTablePrimitif(tableauInt);

		// Tableau de types objets
		String[] tableauString = new String[3];
		displayTableGeneric(tableauString);
		tableauString[0] = "Un";
		tableauString[1] = "Deux";
		tableauString[2] = "Trois";
		displayTableGeneric(tableauString);
	}

	private static void displayTablePrimitif(int[] tableauInt) {
		for (int i = 0; i < tableauInt.length; i++) {
			System.out.println("tableauInt[" + i + "] = " + tableauInt[i]);
		}
		System.out.println("-----------------------");
	}

	private static <E> void displayTableGeneric(E[] table) {
		for (int i = 0; i < table.length; i++) {
			E e = table[i];
			if (e == null) {
				System.out.println("table[" + i + "] = " + e);
			} else {
				System.out.println("table" + e.getClass().getSimpleName() + "[" + i + "] = " + e);
			}
		}
		
	}

}
