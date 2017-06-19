package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="gruppe")
public class Gruppe {
	@Id
	private int gruppen_nr;
	@Column
	private String bezeichnung;
	@Column
	private String kurs_nr;
	
	public Gruppe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gruppe(int gruppen_nr, String bezeichnung, String kurs_nr) {
		super();
		this.gruppen_nr = gruppen_nr;
		this.bezeichnung = bezeichnung;
		this.kurs_nr = kurs_nr;
	}
	public int getGruppen_nr() {
		return gruppen_nr;
	}
	public void setGruppen_nr(int gruppen_nr) {
		this.gruppen_nr = gruppen_nr;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public String getKurs_nr() {
		return kurs_nr;
	}
	public void setKurs_nr(String kurs_nr) {
		this.kurs_nr = kurs_nr;
	}
	@Override
	public String toString() {
		return "Gruppe [gruppen_nr=" + gruppen_nr + ", bezeichnung=" + bezeichnung + ", kurs_nr=" + kurs_nr + "]";
	}
}
