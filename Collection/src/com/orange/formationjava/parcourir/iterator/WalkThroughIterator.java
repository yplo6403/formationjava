package com.orange.formationjava.parcourir.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class WalkThroughIterator<E> {

	public void display(List<E> list) {
		Iterator<E> iterator = list.iterator();
		// compléter: afficher et supprimer les éléments null
	}

	public static void main(String[] args) {
		String[] tab = new String[] {"toto", "titi"};
		WalkThroughIterator<String> test = new WalkThroughIterator<>();
		List<String> myList = new ArrayList<String>(Arrays.asList(tab));
		myList.add(null);
		test.display(myList);
	}
}
