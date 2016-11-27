package com.orange.formationjava.trier.treeset;

import java.util.TreeSet;

public class SortTreeSet<E> {

	private void display(TreeSet<E> myTreeSet) {
		for (E element : myTreeSet) {
			System.out.println("Element=" + element);
		}
	}

	public static void main(String[] args) {
		SortTreeSet<Person> test = new SortTreeSet<>();
		TreeSet<Person> myTreeSet = new TreeSet<>();
		myTreeSet.add(new Person("Bruno","FROGER"));
		myTreeSet.add(new Person("Patrice","WACRENIER"));
		myTreeSet.add(new Person("Christophe","BETOULE"));
		myTreeSet.add(new Person("Oliver","RESNAIS"));
		myTreeSet.add(new Person("Jerome","CRESTEL"));
		myTreeSet.add(new Person("Thierry","MARCOT"));
		test.display(myTreeSet);
		// Exécuter et corriger
	}

}
