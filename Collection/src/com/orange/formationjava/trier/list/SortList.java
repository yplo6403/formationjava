package com.orange.formationjava.trier.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList<E> {

	public static void display(List<String> list) {
		for (String e : list) {
			System.out.println("element=" + e);
		}
	}

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Un");
		myList.add("Deux");
		myList.add("Trois");
		display(myList);
		
		// Utiliser la méthode statique sort() de la classe Collections pour trier la liste en utilisant le comparator de l'objet String

	}
}
