package com.example.Gpseva.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "gram_panchayat")

public class GramPanchayat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String gramPanchayatName;
	private String taluka;
	private String district;
	private Integer population;

	@Column(columnDefinition = "TEXT")
	private String address;

	private String sarpanchName;
	private String sarpanchMobile;

	private String gramSevakName;
	private String gramSevakMobile;

	private String email;

	private String bankName;
	private String accountNumber;
	private String ifscCode;

	private String colorTheme;

	public GramPanchayat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GramPanchayat(Long id, String gramPanchayatName, String taluka, String district, Integer population,
			String address, String sarpanchName, String sarpanchMobile, String gramSevakName, String gramSevakMobile,
			String email, String bankName, String accountNumber, String ifscCode, String colorTheme) {
		super();
		this.id = id;
		this.gramPanchayatName = gramPanchayatName;
		this.taluka = taluka;
		this.district = district;
		this.population = population;
		this.address = address;
		this.sarpanchName = sarpanchName;
		this.sarpanchMobile = sarpanchMobile;
		this.gramSevakName = gramSevakName;
		this.gramSevakMobile = gramSevakMobile;
		this.email = email;
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.colorTheme = colorTheme;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGramPanchayatName() {
		return gramPanchayatName;
	}

	public void setGramPanchayatName(String gramPanchayatName) {
		this.gramPanchayatName = gramPanchayatName;
	}

	public String getTaluka() {
		return taluka;
	}

	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSarpanchName() {
		return sarpanchName;
	}

	public void setSarpanchName(String sarpanchName) {
		this.sarpanchName = sarpanchName;
	}

	public String getSarpanchMobile() {
		return sarpanchMobile;
	}

	public void setSarpanchMobile(String sarpanchMobile) {
		this.sarpanchMobile = sarpanchMobile;
	}

	public String getGramSevakName() {
		return gramSevakName;
	}

	public void setGramSevakName(String gramSevakName) {
		this.gramSevakName = gramSevakName;
	}

	public String getGramSevakMobile() {
		return gramSevakMobile;
	}

	public void setGramSevakMobile(String gramSevakMobile) {
		this.gramSevakMobile = gramSevakMobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getColorTheme() {
		return colorTheme;
	}

	public void setColorTheme(String colorTheme) {
		this.colorTheme = colorTheme;
	}

	@Override
	public String toString() {
		return "GramPanchayat [id=" + id + ", gramPanchayatName=" + gramPanchayatName + ", taluka=" + taluka
				+ ", district=" + district + ", population=" + population + ", address=" + address + ", sarpanchName="
				+ sarpanchName + ", sarpanchMobile=" + sarpanchMobile + ", gramSevakName=" + gramSevakName
				+ ", gramSevakMobile=" + gramSevakMobile + ", email=" + email + ", bankName=" + bankName
				+ ", accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", colorTheme=" + colorTheme + "]";
	}

}
