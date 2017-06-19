package com.rating.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name="belegung_einzeln")
public class Belegung_Einzeln {
	@Column
	private String iz_kuerzel;
	@Column
	private int matrk_num;
	@Column
	private String bezeichnung_kurs;
	@Column
	private String semester_kurs;
	@Column
	private String einzeln_kriterium;
	@Column
	private double einzeln_note;
	
	public Belegung_Einzeln() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Belegung_Einzeln(String iz_kuerzel, int matrk_num, String bezeichnung_kurs, String semester_kurs,
			String einzeln_kriterium, double einzeln_note) {
		super();
		this.iz_kuerzel = iz_kuerzel;
		this.matrk_num = matrk_num;
		this.bezeichnung_kurs = bezeichnung_kurs;
		this.semester_kurs = semester_kurs;
		this.einzeln_kriterium = einzeln_kriterium;
		this.einzeln_note = einzeln_note;
	}
	public String getIz_kuerzel() {
		return iz_kuerzel;
	}
	public void setIz_kuerzel(String iz_kuerzel) {
		this.iz_kuerzel = iz_kuerzel;
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
	public String getEinzeln_kriterium() {
		return einzeln_kriterium;
	}
	public void setEinzeln_kriterium(String einzeln_kriterium) {
		this.einzeln_kriterium = einzeln_kriterium;
	}
	public double getEinzeln_note() {
		return einzeln_note;
	}
	public void setEinzeln_note(double einzeln_note) {
		this.einzeln_note = einzeln_note;
	}
	@Override
	public String toString() {
		return "Belegung_Einzeln [iz_kuerzel=" + iz_kuerzel + ", matrk_num=" + matrk_num + ", bezeichnung_kurs="
				+ bezeichnung_kurs + ", semester_kurs=" + semester_kurs + ", einzeln_kriterium=" + einzeln_kriterium
				+ ", einzeln_note=" + einzeln_note + "]";
	}
}
