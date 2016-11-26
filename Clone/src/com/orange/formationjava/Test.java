package com.orange.formationjava;

public class Test {

	private void testClone() {
		Address address = new Address("Hugo", "Boss", "Galles");
		Person person = new Person("Alex", "Thomson", address);
		
		Person personCopie = (Person) person.clone();
		System.out.println("personCopie " + personCopie);
		
		address.setState("Australie");
		System.out.println("personCopie " + personCopie);
		System.out.println("person " + person);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.testClone();
	}
}
