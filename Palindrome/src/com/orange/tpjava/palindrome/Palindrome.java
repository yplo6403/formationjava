package com.orange.tpjava.palindrome;

public class Palindrome {

	public boolean estPalindrome(String s) {
		if (s == null) {
			throw new IllegalArgumentException("Invalid null parameter");
		}
		if (s.length() == 0)  {
			return false;
		}
		s = s.toLowerCase();
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1))
				return false;
		}
		return true;
	}

}