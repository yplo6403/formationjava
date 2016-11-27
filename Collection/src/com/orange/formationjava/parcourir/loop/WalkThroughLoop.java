package com.orange.formationjava.parcourir.loop;

import java.util.Arrays;
import java.util.List;

public class WalkThroughLoop<E> {

	public void display(List<E> list) {
		// Compléter : utiliser le mot clef 'foreach'
	}

	public static void main(String[] args) {
		WalkThroughLoop<String> test = new WalkThroughLoop<>();
		List<String> myList = Arrays.asList(args);
		myList.add(null);
		test.display(myList);
	}
}
