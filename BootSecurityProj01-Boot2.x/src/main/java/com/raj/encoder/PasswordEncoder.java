package com.raj.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String pwd1 = encoder.encode("asha");
		String pwd2 = encoder.encode("hyd");
		String pwd3 = encoder.encode("vizag");
		
		System.out.println(pwd1+" :: "+pwd2+" :: "+pwd3);
	}
}
