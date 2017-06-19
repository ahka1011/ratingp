package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="student")
public class Student {
	@Id
	private String iz_kuerzel;
	@Column
	private String vorname;
	@Column
	private String nachname;
	@Column
	private int matrk_num;
	@Column
	private String email_adresse;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String iz_kuerzel, String vorname, String nachname, int matrk_num, String email_adresse) {
		super();
		this.iz_kuerzel = iz_kuerzel;
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrk_num = matrk_num;
		this.email_adresse = email_adresse;
	}
	@Override
	public String toString() {
		return "Student [iz_kuerzel=" + iz_kuerzel + ", vorname=" + vorname + ", nachname=" + nachname + ", matrk_num="
				+ matrk_num + ", email_adresse=" + email_adresse + "]";
	}
	public String getIz_kuerzel() {
		return iz_kuerzel;
	}
	public void setIz_kuerzel(String iz_kuerzel) {
		this.iz_kuerzel = iz_kuerzel;
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
	public int getMatrk_num() {
		return matrk_num;
	}
	public void setMatrk_num(int matrk_num) {
		this.matrk_num = matrk_num;
	}
	public String getEmail_adresse() {
		return email_adresse;
	}
	public void setEmail_adresse(String email_adresse) {
		this.email_adresse = email_adresse;
	}
}
