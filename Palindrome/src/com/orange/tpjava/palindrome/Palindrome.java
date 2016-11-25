package com.orange.tpjava.palindrome;

public class Palindrome {

	static boolean estPalindrome(String s) {
		if (s == null) {
			throw new NullPointerException("Invalid null parameter");
		}
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (args.length > 0) {
			String mot = args[0];
			System.out.println("'" + mot + "' est un palindrome ? " + estPalindrome(mot));
		}
	}
}