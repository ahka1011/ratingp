package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="kurvorlage")
public class Kursvorlage {
	@Id
	private int kurs_nr;
	@Column
	private String bezeichnung_kurs;
	@Column
	private String semester_kurs;
	@Column 
	private String iz_kuerzel;
	
	public Kursvorlage(int kurs_nr, String bezeichnung_kurs, String semester_kurs, String iz_kuerzel) {
		super();
		this.kurs_nr = kurs_nr;
		this.bezeichnung_kurs = bezeichnung_kurs;
		this.semester_kurs = semester_kurs;
		this.iz_kuerzel = iz_kuerzel;
	}
	
	public Kursvorlage() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getKurs_nr() {
		return kurs_nr;
	}
	public void setKurs_nr(int kurs_nr) {
		this.kurs_nr = kurs_nr;
	}
	public String getBezeichnung_kurs() {
		return bezeichnung_kurs;
	}
	public void setBezeichnung_kurs(String bezeichnung_kurs) {
		this.bezeichnung_kurs = bezeichnung_kurs;
	}
	public String getSemester_kurs() {
		return semester_kurs;
	}
	public void setSemester_kurs(String semester_kurs) {
		this.semester_kurs = semester_kurs;
	}
	public String getIz_kuerzel() {
		return iz_kuerzel;
	}
	public void setIz_kuerzel(String iz_kuerzel) {
		this.iz_kuerzel = iz_kuerzel;
	}

	@Override
	public String toString() {
		return "Kursvorlage [kurs_nr=" + kurs_nr + ", bezeichnung_kurs=" + bezeichnung_kurs + ", semester_kurs="
				+ semester_kurs + ", iz_kuerzel=" + iz_kuerzel + "]";
	}
}
