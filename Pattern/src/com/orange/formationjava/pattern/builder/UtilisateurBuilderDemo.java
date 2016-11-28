package com.orange.formationjava.pattern.builder;

public class UtilisateurBuilderDemo {

	public static void main(String[] args) {
		Utilisateur user1 = new Utilisateur("Marc", "Dutroux");
		System.out.println(user1);
		Utilisateur user2 = new Utilisateur("Guy", "Georges", 50);
		System.out.println(user2);
		Utilisateur user3 = new Utilisateur("Emile", "Louis", "42 Rue de la Santé, 75014 Paris");
		System.out.println(user3);
	}
}
