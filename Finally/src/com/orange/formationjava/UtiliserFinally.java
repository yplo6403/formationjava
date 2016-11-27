package com.orange.formationjava;

class UtiliseFinally {
	static int moyenne(String[] liste) {
		int somme = 0, nbEntiers = 0;
		for (String chaine : liste) {
			try {
				somme += Integer.parseInt(chaine);
				nbEntiers++;
				
			} finally {
				System.out.println("donnee traitee : " + chaine);
			}
		}
		return somme / nbEntiers;
	}

	public static void main(String[] arg) {
		try {
			System.out.println("La moyenne est " + moyenne(arg));
			
		} catch (NumberFormatException e) {
			System.out.println("Erreur sur vos entiers");
		}
	}
}
