package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="gruppe_berechnung")
public class Gruppe_Berechnung {
	@Column
	private String iz_kuerzel;
	@Column
	private int gruppen_nr;
	@Column
	private int kurs_nr;
	@Column
	private double gruppen_note;

	public Gruppe_Berechnung() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIz_kuerzel() {
		return iz_kuerzel;
	}
	public void setIz_kuerzel(String iz_kuerzel) {
		this.iz_kuerzel = iz_kuerzel;
	}
	public int getGruppen_nr() {
		return gruppen_nr;
	}
	public void setGruppen_nr(int gruppen_nr) {
		this.gruppen_nr = gruppen_nr;
	}
	public int getKurs_nr() {
		return kurs_nr;
	}
	public void setKurs_nr(int kurs_nr) {
		this.kurs_nr = kurs_nr;
	}
	public double getGruppen_note() {
		return gruppen_note;
	}
	public void setGruppen_note(double gruppen_note) {
		this.gruppen_note = gruppen_note;
	}
	public Gruppe_Berechnung(String iz_kuerzel, int gruppen_nr, int kurs_nr, double gruppen_note) {
		super();
		this.iz_kuerzel = iz_kuerzel;
		this.gruppen_nr = gruppen_nr;
		this.kurs_nr = kurs_nr;
		this.gruppen_note = gruppen_note;
	}
	@Override
	public String toString() {
		return "Gruppe_Berechnung [iz_kuerzel=" + iz_kuerzel + ", gruppen_nr=" + gruppen_nr + ", kurs_nr=" + kurs_nr
				+ ", gruppen_note=" + gruppen_note + "]";
	}
}
