package com.orange.tpjava.palindrome;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTest extends Palindrome {

	private Palindrome mPalindrome;

	@Before
	public void runBeforeEveryTest() {
		mPalindrome = new Palindrome();
	}

	@Test
	public void testCaseZeroLength() {
		assertFalse(mPalindrome.estPalindrome(""));
	}

	@Test
	public void testCaseCaseInsensitive() {
		assertTrue(mPalindrome.estPalindrome("Laval"));
	}

	@Test
	public void testCaseNormaleCase() {
		assertTrue(mPalindrome.estPalindrome("sees"));
		assertFalse(mPalindrome.estPalindrome("lannion"));
	}

	@Test
	public void testCaseNullArg() {
		try {
			assertTrue(mPalindrome.estPalindrome(null));
			fail("IllegalArgumentException expected");
		} catch (IllegalArgumentException e) {
		}
	}
}
