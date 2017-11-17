package com.orange.formationjava.parcourir.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class WalkThroughIterator {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("toto");
		myList.add("titi");
		myList.add(null);
		Iterator<String> iterator = myList.iterator();
		// compléter: afficher et supprimer les éléments null en utilisant une boucle while(...)
	}
}
