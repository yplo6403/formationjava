package com.orange.formationjava.pattern.factory;

import com.orange.formationjava.pattern.factory.ShapeFactory.ShapeEnum;

public class FactoryPatternDemo {

	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape(ShapeEnum.CERCLE, 10);

	      //call draw method of Circle
	      shape1.draw();

	      //get an object of Rectangle and call its draw method.
	      Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE, 20, 30);

	      //call draw method of Rectangle
	      shape2.draw();

	      //get an object of Square and call its draw method.
	      Shape shape3 = shapeFactory.getShape(ShapeEnum.CARRE, 7);

	      //call draw method of Square
	      shape3.draw();
	   }
}
