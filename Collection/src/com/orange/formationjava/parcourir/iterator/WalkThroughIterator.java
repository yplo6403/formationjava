package com.orange.formationjava.parcourir.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class WalkThroughIterator<E> {

	public void display(List<E> list) {
		Iterator<E> iterator = list.iterator();
		// compl�ter: afficher et supprimer les �l�ments null
	}

	public static void main(String[] args) {
		WalkThroughIterator<String> test = new WalkThroughIterator<>();
		List<String> myList = Arrays.asList(args);
		myList.add(null);
		test.display(myList);
	}
}
