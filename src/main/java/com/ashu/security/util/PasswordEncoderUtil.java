package com.ashu.security.util;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEncoderUtil {

	public String encodePassword(String rawPassword) {

		Encoder encoder = Base64.getEncoder();

		String encodedPassword = encoder.encodeToString(rawPassword.getBytes());

		return encodedPassword;
	}

	public String add() {
		String txt = "hello good evenin";
		return txt;
	}

	public String fullName(String fn, String sn) {

		String fullName = fn + sn;
		return fullName;
	}

	public int add1(int a, int b) {

		int c = a + b;
		return c;

	}

}
