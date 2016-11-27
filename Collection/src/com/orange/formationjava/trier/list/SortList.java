package com.orange.formationjava.trier.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList<E> {

	public void display(List<E> list) {
		for (E e : list) {
			System.out.println("element=" + e);
		}
	}

	public static void main(String[] args) {
		SortList<String> test = new SortList<>();
		List<String> myList = new ArrayList<>();
		myList.add("Un");
		myList.add("Deux");
		myList.add("Trois");
		myList.add(null);
		test.display(myList);
		// Afficher une liste triée
	}
}
