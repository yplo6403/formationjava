package com.orange.formationjava.trier.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.orange.formationjava.trier.Person;

public class CustomSortList {

	public static void display(List<Person> list) {
		for (Person element : list) {
			System.out.println("element=" + element);
		}
	}

	public static void main(String[] args) {
		List<Person> myList = new ArrayList<>();
		myList.add(new Person("Bruno", "FROGER", 3));
		myList.add(new Person("Patrice", "WACRENIER", 4));
		myList.add(new Person("Christophe", "BETOULE", 1));
		myList.add(new Person("Oliver", "RESNAIS", 2));
		myList.add(new Person("Jerome", "CRESTEL", 6));
		myList.add(new Person("Thierry", "MARCOT", 5));
		display(myList);
		System.out.println("----------------------------------");
		// Créer/Implémenter le comparator pour trier la liste par age
		Comparator<Person> comparator;
		myList.sort(comparator);
		display(myList);
	}
}
