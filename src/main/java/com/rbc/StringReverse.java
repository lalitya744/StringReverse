package com.rbc;

public class StringReverse {
	public char[] reverseIt(char[] str) {
		for(int i = 0; i < str.length/2; i++) {
			char temp = str[i];
			str[i] = str[str.length-i-1];
			str[str.length-i-1] = temp;
		}
		return str;
	}
}
