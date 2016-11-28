package com.orange.formationjava.pattern.builder;

public class UtilisateurBuilderDemo {

	public static void main(String[] args) {

		Utilisateur user1 = new Utilisateur.UtilisateurBuilder("Marc", "Dutroux").build();
		System.out.println(user1);
		Utilisateur user2 = new Utilisateur.UtilisateurBuilder("Guy", "Georges").addAge(50).build();
		System.out.println(user2);
		Utilisateur user3 = new Utilisateur.UtilisateurBuilder("Emile", "Louis")
				.addAdresse("42 Rue de la Santé, 75014 Paris").build();
		System.out.println(user3);
	}
}
