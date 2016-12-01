package com.orange.formationjava.parcourir.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WalkThroughMap<K, V> {

	public void displayKeySet(Map<K, V> map) {
		Set<K> clefs = map.keySet();
		// Compléter en utilisant le mot clef 'foreach'
		for (K clef : clefs) {
			System.out.println("Key=" + clef);
		}
	}

	public void displayValues(Map<K, V> map) {
		Collection<V> values = map.values();
		// Compléter en utilisant le mot clef 'foreach'
		for (V value : values) {
			System.out.println("Value=" + value);
		}
	}

	public void displayEntrySet(Map<K, V> map) {
		Set<Map.Entry<K, V>> entries = map.entrySet();
		// Compléter en utilisant le mot clef 'foreach'
		for (Entry<K, V> entry : entries) {
			System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
		}
	}

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Un", 1);
		myMap.put("Deux", 2);
		myMap.put("Trois", 3);
		WalkThroughMap<String, Integer> test = new WalkThroughMap<>();
		test.displayKeySet(myMap);
		System.out.println("________________");
		test.displayValues(myMap);
		System.out.println("________________");
		test.displayEntrySet(myMap);
	}
}
