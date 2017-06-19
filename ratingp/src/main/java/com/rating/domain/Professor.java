package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="professor")
public class Professor {
	@Id
	private String iz_kuerzel;
	@Column
	private String vorname;
	@Column
	private String nachname;
	@Column
	private String email_adresse;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String iz_kuerzel, String vorname, String nachname, String email_adresse) {
		super();
		this.iz_kuerzel = iz_kuerzel;
		this.vorname = vorname;
		this.nachname = nachname;
		this.email_adresse = email_adresse;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getIz_kuerzel() {
		return iz_kuerzel;
	}
	public void setIz_kuerzel(String iz_kuerzel) {
		this.iz_kuerzel = iz_kuerzel;
	}
	public String getEmail_adresse() {
		return email_adresse;
	}
	public void setEmail_adresse(String email_adresse) {
		this.email_adresse = email_adresse;
	}
	@Override
	public String toString() {
		return "Professor [iz_kuerzel=" + iz_kuerzel + ", vorname=" + vorname + ", nachname=" + nachname
				+ ", email_adresse=" + email_adresse + "]";
	}
}
