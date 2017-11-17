package com.orange.formationjava.trier.treeset;

import java.util.TreeSet;

import com.orange.formationjava.trier.Person;

public class SortTreeSet {

	private static void display(TreeSet<Person> myTreeSet) {
		for (Person element : myTreeSet) {
			System.out.println("Element=" + element);
		}
	}

	public static void main(String[] args) {
		TreeSet<Person> myTreeSet = new TreeSet<>();
		myTreeSet.add(new Person("Bruno", "FROGER", 1));
		myTreeSet.add(new Person("Patrice", "WACRENIER", 2));
		myTreeSet.add(new Person("Christophe", "BETOULE", 3));
		myTreeSet.add(new Person("Oliver", "RESNAIS", 4));
		myTreeSet.add(new Person("Jerome", "CRESTEL", 5));
		myTreeSet.add(new Person("Thierry", "MARCOT", 6));
		display(myTreeSet);
		// Exécuter et corriger
	}

}
