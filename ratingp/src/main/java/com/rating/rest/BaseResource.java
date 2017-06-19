package com.rating.rest;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

public class BaseResource {

	static HashMap<String, HttpSession> token2session = new HashMap<String, HttpSession>();

	static boolean isValid(String token) throws Exception {
		try {
			HttpSession s = token2session.get(token);
			return true;

		} catch (Exception e) {
			throw new Exception("Token is not valid");
		}

	}
}
