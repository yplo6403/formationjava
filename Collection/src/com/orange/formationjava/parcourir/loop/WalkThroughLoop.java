package com.orange.formationjava.parcourir.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WalkThroughLoop<E> {

	public void display(List<E> list) {
		// Compléter : utiliser le mot clef 'foreach'
	}

	public static void main(String[] args) {
		String[] tab = new String[] {"toto", "titi"};
		WalkThroughLoop<String> test = new WalkThroughLoop<>();
		List<String> myList = new ArrayList<String>(Arrays.asList(tab));
		myList.add(null);
		test.display(myList);
	}
}
