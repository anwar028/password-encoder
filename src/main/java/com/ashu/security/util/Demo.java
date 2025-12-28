package com.ashu.security.util;

public class Demo {

	// BUG-2
	public String m1() {

		return "hi";
	}

	public static void main(String[] args) {

		Demo d = new Demo();

		d.m1();

	}

}
