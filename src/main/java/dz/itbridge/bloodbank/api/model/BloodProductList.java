package dz.itbridge.bloodbank.api.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name = "du_bloodattribute_qtyhand_v")
public class BloodProductList {
	
	public BloodProductList() {
		
	}

	@Id
	@Column(name = "du_bloodattribute_id")
	private int du_bloodattribute_id;
	
	@Column(name = "lot")
	private String nSerie;
	
	@Column(name = "dateprelev")
	private Timestamp dateprelev;

	@Column(name = "guaranteedate")
	private Timestamp dateExp;
	
	@Column(name = "bloodgroup")
	private String bloodgroup;
	
	@Column(name = "volume")
	private BigDecimal volume;
	
	@Column(name = "serologie")
	private String serologie;
	
	@Column(name = "bloodstatus")
	private String bloodstatus;

	public String getnSerie() {
		return nSerie;
	}

	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}

	public Timestamp getDateprelev() {
		return dateprelev;
	}

	public void setDateprelev(Timestamp dateprelev) {
		this.dateprelev = dateprelev;
	}

	public Timestamp getDateExp() {
		return dateExp;
	}

	public void setDateExp(Timestamp dateExp) {
		this.dateExp = dateExp;
	}

	public String getBloodgroup() {
		if (bloodgroup == null || bloodgroup.length()==0)
			return "";
		else return bloodgroup.replaceAll("-", " Neg");
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public String getSerologie() {
		if (serologie.equals("0")) {
            return "Non Faite";
        }
        else {
            return "Negatif";
        }
	}

	public void setSerologie(String serologie) {
		this.serologie = serologie;
	}

	public String getBloodstatus() {
		if (bloodstatus.equals("0")) {
            return "Non Fait";
        }
        else {
            return "Negatif";
        }
	}

	public void setBloodstatus(String bloodstatus) {
		this.bloodstatus = bloodstatus;
	}

	public int getDu_bloodattribute_id() {
		return du_bloodattribute_id;
	}

	public void setDu_bloodattribute_id(int du_bloodattribute_id) {
		this.du_bloodattribute_id = du_bloodattribute_id;
	}
	
	
}
