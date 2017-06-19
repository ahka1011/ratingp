package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="kriterium")
public class Kriterium {
	@Id
	private String bezeichnung;
	@Column
	private double gewichtung;
	@Column
	private int gruppen_nr;

	public Kriterium() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kriterium(String bezeichnung, double gewichtung, int gruppen_nr) {
		super();
		this.bezeichnung = bezeichnung;
		this.gewichtung = gewichtung;
		this.gruppen_nr = gruppen_nr;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getGewichtung() {
		return gewichtung;
	}
	public void setGewichtung(double gewichtung) {
		this.gewichtung = gewichtung;
	}
	public int getGruppen_nr() {
		return gruppen_nr;
	}
	public void setGruppen_nr(int gruppen_nr) {
		this.gruppen_nr = gruppen_nr;
	}
	@Override
	public String toString() {
		return "Kriterium [bezeichnung=" + bezeichnung + ", gewichtung=" + gewichtung + ", gruppen_nr=" + gruppen_nr
				+ "]";
	}
}
