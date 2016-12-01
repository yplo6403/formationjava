package com.orange.formationjava.trier.treeset;

import java.util.TreeSet;

import com.orange.formationjava.trier.Person;

public class SortTreeSet<E> {

	private void display(TreeSet<E> myTreeSet) {
		for (E element : myTreeSet) {
			System.out.println("Element=" + element);
		}
	}

	public static void main(String[] args) {
		SortTreeSet<Person> test = new SortTreeSet<>();
		TreeSet<Person> myTreeSet = new TreeSet<>();
		myTreeSet.add(new Person("Bruno", "FROGER", 1));
		myTreeSet.add(new Person("Patrice", "WACRENIER", 2));
		myTreeSet.add(new Person("Christophe", "BETOULE", 3));
		myTreeSet.add(new Person("Oliver", "RESNAIS", 4));
		myTreeSet.add(new Person("Jerome", "CRESTEL", 5));
		myTreeSet.add(new Person("Thierry", "MARCOT", 6));
		test.display(myTreeSet);
	}

}
