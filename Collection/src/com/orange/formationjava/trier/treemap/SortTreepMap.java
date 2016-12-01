package com.orange.formationjava.trier.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.orange.formationjava.trier.Person;

public class SortTreepMap<K, V> {

	public static void main(String[] args) {

		SortTreepMap<Integer, Person> test = new SortTreepMap<>();
		// Par défaut la tree map est ordonnée selon l'ordre naturel des clefs.
		TreeMap<Integer, Person> myTreeMap = new TreeMap<>();
		myTreeMap.put(new Integer(1), new Person("Bruno", "FROGER", 3));
		myTreeMap.put(new Integer(2), new Person("Patrice", "WACRENIER", 2));
		myTreeMap.put(new Integer(3), new Person("Christophe", "BETOULE", 1));
		myTreeMap.put(new Integer(4), new Person("Oliver", "RESNAIS", 5));
		myTreeMap.put(new Integer(5), new Person("Jerome", "CRESTEL", 6));
		myTreeMap.put(new Integer(6), new Person("Thierry", "MARCOT", 4));
		// dans ce cas de figure, notre Map est triée par indice croissant
		test.display(myTreeMap);
		
		System.out.println("------------------------------------------------------");
		
		// Construire une nouvelle TreeMap en passant un Comparateur pour trier sur l'age
		TreeMap<Integer,Person> newTreeMap = new TreeMap<Integer, Person>(new MyComparator(myTreeMap));
		
		// La nouvelle TreeMap est vide! Recopier les valeurs de myTreeMap dans newTreeMap
		newTreeMap.putAll(myTreeMap);
		test.display(newTreeMap);
	}

	private void display(TreeMap<K, V> treeMap) {
		Set<Map.Entry<K, V>> entries = treeMap.entrySet();
		Iterator<Entry<K, V>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Map.Entry<K, V> entry = (Entry<K, V>) iterator.next();
			System.out.println("clé : " + entry.getKey() + " - valeur : " + entry.getValue());
		}
	}
}
