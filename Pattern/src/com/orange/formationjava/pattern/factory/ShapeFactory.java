package com.orange.formationjava.pattern.factory;

public class ShapeFactory {

	public enum ShapeEnum {
		CERCLE, RECTANGLE, CARRE;
	};

	// use getShape method to get object of type shape
	public Shape getShape(ShapeEnum shapeType, Integer... parameters) {
		switch (shapeType) {
		case CERCLE:
			int rayon = parameters[0];
			return new Circle(rayon);

		case RECTANGLE:
			int longueur = parameters[0];
			int largeur = parameters[1];
			if (longueur < largeur) {
				longueur = largeur;
				largeur = parameters[0];
			} else if (longueur == largeur) {
				return new Carre(longueur);
			}
			return new Rectangle(longueur, largeur);

		case CARRE:
			int cote = parameters[0];
			return new Carre(cote);

		default:
			return null;
		}
	}

}
