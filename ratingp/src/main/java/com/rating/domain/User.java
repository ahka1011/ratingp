package com.rating.domain;

import java.util.List;

import com.rating.rest.DatabaseConnector;

public class User {

	private String surname;
	private String forename;
	private String email;
	private String username;
	private String role;
	public static final String STUDENT = "Student";
	public static final String PROFESSOR = "Professor";
	List<Kursvorlage> belegteKurse;
	private Token token;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Kursvorlage> getBelegteKurse() {
		return belegteKurse;
	}

	public void setBelegteKurse(List<Kursvorlage> belegteKurse) {
		this.belegteKurse = belegteKurse;
	}

	public Token getToken() {
		return token;
	}

	public void setToken(Token token) {
		this.token = token;
	}

	public static String getStudent() {
		return STUDENT;
	}

	public static String getProfessor() {
		return PROFESSOR;
	}

	@Override
	public String toString() {
		return "surname=" + surname + ", forename=" + forename + ", email=" + email + ", username=" + username
				+ ", role=" + role + ", token=" + token;
	}

	public User(String surname, String forename, String email, String username, String role, Token token) {
		super();
		this.surname = surname;
		this.forename = forename;
		this.email = email;
		this.username = username;
		this.role = role;
		// this.belegteKurse =
		// DatabaseConnector.studentKursListeSuchen(username);
		this.token = token;
	}
}
