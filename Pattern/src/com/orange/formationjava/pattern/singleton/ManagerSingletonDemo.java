package com.orange.formationjava.pattern.singleton;

public class ManagerSingletonDemo {

	public static void main(String[] args) {
		ManagerSingleton managerSingleton1 = ManagerSingleton.getInstance();
		ManagerSingleton managerSingleton2 = ManagerSingleton.getInstance();
		if (managerSingleton1 == managerSingleton2) {
			System.out.println("Il n'y a qu'une seule instance de singleton");
		} else  {
			System.out.println("Il y a un problème avec mon singleton");
		}
	}
}
