package com.orange.formationjava.test;

import com.orange.formationjava.Address;
import com.orange.formationjava.Person;

public class Test {

	private void testClone() {
		Address address = new Address("rue Jean Marin", "Lannion", "France");
		Person person = new Person("Philippe", "Lemordant", address);
		
		Person personCopie = (Person) person.clone();
		System.out.println("personCopie " + personCopie);
		
		address.setCity("Rennes");
		System.out.println("personCopie " + personCopie);
		System.out.println("person " + person);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.testClone();
	}
}
