package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="einzel_berechnung")
public class Einzel_Berechnung {
	@Column
	private String bezeichnung;
	@Column
	private double einzel_note;
	@Column
	private double gewichtung;
	@Column
	private double ergebnis;
	@Column
	private int matrk_num;
	@Column 
	private int kurs_nr;
	@Column
	private int gruppen_nr;
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getEinzel_note() {
		return einzel_note;
	}
	public void setEinzel_note(double einzel_note) {
		this.einzel_note = einzel_note;
	}
	public double getGewichtung() {
		return gewichtung;
	}
	public void setGewichtung(double gewichtung) {
		this.gewichtung = gewichtung;
	}
	public double getErgebnis() {
		return ergebnis;
	}
	public void setErgebnis(double ergebnis) {
		this.ergebnis = ergebnis;
	}
	public int getMatrk_num() {
		return matrk_num;
	}
	public void setMatrk_num(int matrk_num) {
		this.matrk_num = matrk_num;
	}
	public int getKurs_nr() {
		return kurs_nr;
	}
	public void setKurs_nr(int kurs_nr) {
		this.kurs_nr = kurs_nr;
	}
	public int getGruppen_nr() {
		return gruppen_nr;
	}
	public void setGruppen_nr(int gruppen_nr) {
		this.gruppen_nr = gruppen_nr;
	}
	public Einzel_Berechnung(String bezeichnung, double einzel_note, double gewichtung, double ergebnis, int matrk_num,
			int kurs_nr, int gruppen_nr) {
		super();
		this.bezeichnung = bezeichnung;
		this.einzel_note = einzel_note;
		this.gewichtung = gewichtung;
		this.ergebnis = ergebnis;
		this.matrk_num = matrk_num;
		this.kurs_nr = kurs_nr;
		this.gruppen_nr = gruppen_nr;
	}
	public Einzel_Berechnung() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Einzel_Berechnung [bezeichnung=" + bezeichnung + ", einzel_note=" + einzel_note + ", gewichtung="
				+ gewichtung + ", ergebnis=" + ergebnis + ", matrk_num=" + matrk_num + ", kurs_nr=" + kurs_nr
				+ ", gruppen_nr=" + gruppen_nr + "]";
	}
}
