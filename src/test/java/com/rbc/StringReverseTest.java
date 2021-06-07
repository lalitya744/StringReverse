package com.rbc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class StringReverseTest {

	@Test
	void test1() {
		char[] reversed = new StringReverse().reverseIt("hello".toCharArray());
		assertArrayEquals("olleh".toCharArray(), reversed);
	}
	
	@Test
	void test2() {
		char[] reversed = new StringReverse().reverseIt("Hannah".toCharArray());
		assertArrayEquals("hannaH".toCharArray(), reversed);
	}

}
