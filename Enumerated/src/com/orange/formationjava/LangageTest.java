package com.orange.formationjava;

import static org.junit.Assert.*;

import org.junit.Test;

public class LangageTest {

	@Test
	public void testValueOf() {
		assertEquals(Langage.CPP,Langage.valueOf(10));
		assertEquals(Langage.JAVA,Langage.valueOf(1));
		assertEquals(Langage.PHP,Langage.valueOf(20));
	}

	@Test
	public void testToInt() {
		assertEquals(1,Langage.JAVA.toInt());
		assertEquals(10,Langage.CPP.toInt());
		assertEquals(20,Langage.PHP.toInt());
	}

}
