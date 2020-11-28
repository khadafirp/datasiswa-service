package com.example.datasiswa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_siswa")
public class DataSiswaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nama_siswa")
	private String namaSiswa;
	
	@Column(name = "nis")
	private String nis;
	
	@Column(name = "kelas")
	private String kelas;
	
	@Column(name = "nama_sekolah")
	private String namaSekolah;
	
	@Column(name = "ttl")
	private String ttl;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "nohp")
	private String nohp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaSiswa() {
		return namaSiswa;
	}

	public void setNamaSiswa(String namaSiswa) {
		this.namaSiswa = namaSiswa;
	}

	public String getNis() {
		return nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}

	public String getNamaSekolah() {
		return namaSekolah;
	}

	public void setNamaSekolah(String namaSekolah) {
		this.namaSekolah = namaSekolah;
	}

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNohp() {
		return nohp;
	}

	public void setNohp(String nohp) {
		this.nohp = nohp;
	}
	
}
