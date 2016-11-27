package com.orange.formationjava.trier.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.orange.formationjava.trier.Person;

public class CustomSortList<E> {

	public void display(List<E> list) {
		for (E e : list) {
			System.out.println("element=" + e);
		}
	}

	public static void main(String[] args) {
		CustomSortList<Person> test = new CustomSortList<>();
		List<Person> myList = new ArrayList<>();
		myList.add(new Person("Bruno", "FROGER", 3));
		myList.add(new Person("Patrice", "WACRENIER", 4));
		myList.add(new Person("Christophe", "BETOULE", 1));
		myList.add(new Person("Oliver", "RESNAIS", 2));
		myList.add(new Person("Jerome", "CRESTEL", 6));
		myList.add(new Person("Thierry", "MARCOT", 5));
		// Afficher une liste triée par age

		test.display(myList);
	}
}
