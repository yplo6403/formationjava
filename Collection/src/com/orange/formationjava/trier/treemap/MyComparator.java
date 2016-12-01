package com.orange.formationjava.trier.treemap;

import java.util.Comparator;
import java.util.TreeMap;

import com.orange.formationjava.trier.Person;

public class MyComparator implements Comparator<Integer> {

	private final TreeMap<Integer, Person> mTreeMap;
	
	public MyComparator(TreeMap<Integer, Person> myTreeMap) {
		mTreeMap = myTreeMap;
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return mTreeMap.get(o1).getAge().compareTo(mTreeMap.get(o2).getAge());
	}

}
