package com.rating.domain;

public class Token {

	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Token(String role) {
		long nowMillis = System.currentTimeMillis();

		token = role + "rtt" + nowMillis + Math.random();
	}

	@Override
	public String toString() {
		return token;
	}

	public String role(String token) {
		if (token.contains("Professor"))
			return "Professor";
		else
			return "Student";
	}

}
