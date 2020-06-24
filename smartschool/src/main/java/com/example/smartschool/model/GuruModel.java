package com.example.smartschool.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_GURU")
public class GuruModel {
	
	@Id
	@Column(name="Nip_Guru")
	private String nipGuru;
	
	@Column(name="Nama_Guru")
	private String namaGuru;
	
	@Column(name="Telepon_Guru")
	private String teleponGuru;
	
	@Column(name="Gender_Guru")
	private String genderGuru;
	 
	@Column(name="Gelar_Guru")
	private String gelarGuru;
	
	@Column(name="Alamat_Guru")
	private String alamatGuru;

	public String getNipGuru() {
		return nipGuru;
	}

	public void setNipGuru(String nipGuru) {
		this.nipGuru = nipGuru;
	}

	public String getNamaGuru() {
		return namaGuru;
	}

	public void setNamaGuru(String namaGuru) {
		this.namaGuru = namaGuru;
	}

	public String getTeleponGuru() {
		return teleponGuru;
	}

	public void setTeleponGuru(String teleponGuru) {
		this.teleponGuru = teleponGuru;
	}

	public String getGenderGuru() {
		return genderGuru;
	}

	public void setGenderGuru(String genderGuru) {
		this.genderGuru = genderGuru;
	}

	public String getGelarGuru() {
		return gelarGuru;
	}

	public void setGelarGuru(String gelarGuru) {
		this.gelarGuru = gelarGuru;
	}

	public String getAlamatGuru() {
		return alamatGuru;
	}

	public void setAlamatGuru(String alamatGuru) {
		this.alamatGuru = alamatGuru;
	}
	
	

}
