package com.orange.formationjava;

public class Test {

	Animal[] animaux;

	public void faireCrierTousLesAnimaux() {
		animaux = new Animal[3];
		animaux[0] = new Cow("Marguerite");
		animaux[1] = new Horse("Tornado");
		animaux[2] = new Sheep("Dolly");
		for (Animal animal : animaux) {
			System.out.println("L\'animal '" + animal.getName() + "' du type '" + animal.getClass().getSimpleName()
					+ "' a pour cri: " + animal.sound());
		}
	}

	public static void main(String[] args) {
		new Test().faireCrierTousLesAnimaux();
	}
}
