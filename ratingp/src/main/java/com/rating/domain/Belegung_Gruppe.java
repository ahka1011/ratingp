package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="belegung_gruppe")
public class Belegung_Gruppe {
	@Column
	private int gruppen_nr;
	@Column
	private int matrk_num;
	@Column
	private String bezeichnung_kurs;
	@Column
	private String semester_kurs;
	@Column
	private int kurs_nr;
	@Column
	private double gruppe_note;
	
	public Belegung_Gruppe(int gruppen_nr, int matrk_num, String bezeichnung_kurs, String semester_kurs, int kurs_nr,
			double gruppe_note) {
		super();
		this.gruppen_nr = gruppen_nr;
		this.matrk_num = matrk_num;
		this.bezeichnung_kurs = bezeichnung_kurs;
		this.semester_kurs = semester_kurs;
		this.kurs_nr = kurs_nr;
		this.gruppe_note = gruppe_note;
	}

	public Belegung_Gruppe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getGruppen_nr() {
		return gruppen_nr;
	}

	public void setGruppen_nr(int gruppen_nr) {
		this.gruppen_nr = gruppen_nr;
	}

	public int getMatrk_num() {
		return matrk_num;
	}

	public void setMatrk_num(int matrk_num) {
		this.matrk_num = matrk_num;
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

	public int getKurs_nr() {
		return kurs_nr;
	}

	public void setKurs_nr(int kurs_nr) {
		this.kurs_nr = kurs_nr;
	}

	public double getGruppe_note() {
		return gruppe_note;
	}

	public void setGruppe_note(double gruppe_note) {
		this.gruppe_note = gruppe_note;
	}

	@Override
	public String toString() {
		return "Belegung_Gruppe [gruppen_nr=" + gruppen_nr + ", matrk_num=" + matrk_num + ", bezeichnung_kurs="
				+ bezeichnung_kurs + ", semester_kurs=" + semester_kurs + ", kurs_nr=" + kurs_nr + ", gruppe_note="
				+ gruppe_note + "]";
	}
}
