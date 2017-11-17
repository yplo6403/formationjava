package com.orange.formationjava.parcourir.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WalkThroughMap {

	public static void displayKeySet(Map<String, Integer> map) {
		Set<String> clefs = map.keySet();
		// Compléter en utilisant le mot clef 'foreach'
	}

	public static void displayValues(Map<String, Integer> map) {
		Collection<Integer> values = map.values();
		// Compléter en utilisant le mot clef 'foreach'
	}

	public static void displayEntrySet(Map<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		// Compléter en utilisant le mot clef 'foreach'
	}

	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<String, Integer>();
		myMap.put("Un", 1);
		myMap.put("Deux", 2);
		myMap.put("Trois", 3);
		displayKeySet(myMap);
		displayValues(myMap);
		displayEntrySet(myMap);
	}
}
