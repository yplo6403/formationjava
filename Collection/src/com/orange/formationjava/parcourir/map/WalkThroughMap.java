package com.orange.formationjava.parcourir.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WalkThroughMap<K, V> {

	public void displayKeySet(Map<K, V> map) {
		Set<K> clefs = map.keySet();
		// Compl�ter en utilisant le mot clef 'foreach'
	}

	public void displayValues(Map<K, V> map) {
		Collection<V> values = map.values();
		// Compl�ter en utilisant le mot clef 'foreach'
	}

	public void displayEntrySet(Map<K, V> map) {
		Set<Map.Entry<K, V>> entries = map.entrySet();
		// Compl�ter en utilisant le mot clef 'foreach'
	}

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Un", 1);
		myMap.put("Deux", 2);
		myMap.put("Trois", 3);
		WalkThroughMap test = new WalkThroughMap();
		test.displayKeySet(myMap);
		test.displayValues(myMap);
		test.displayEntrySet(myMap);
	}
}
