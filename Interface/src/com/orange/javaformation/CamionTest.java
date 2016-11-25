package com.orange.javaformation;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	@Test
	public void testInstanceOf() {
		Camion monCamion = new Camion();
		assertTrue(monCamion instanceof Demarrable);
	}
	
	@Test
	public void testClassOf() {
		Camion monCamion = new Camion();
		assertTrue(monCamion.getClass() == Demarrable.class);
	}

}
