package model;

import java.util.Date;

public class Person {
	private String nama;
	private String alamat;
	private String noHP;
	private Date tglLahir;
	
	public String getAlamat() {
		return alamat;
	}
	
	public void setAlamat (String alamat) {
		this.alamat = alamat;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama (String nama) {
		this.nama = nama;
	}
	
	public String getNoHP() {
		return noHP;
	}
	
	public void setNoHP (String noHP) {
		this.noHP = noHP;
	}
	
	public Date getTglLahir() {
		return tglLahir;
	}	
	
	public void setTglLahir (Date tglLahir) {
		this.tglLahir = tglLahir;
	}
}