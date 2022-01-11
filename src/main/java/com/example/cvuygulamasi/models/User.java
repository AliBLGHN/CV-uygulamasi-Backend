package com.example.cvuygulamasi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tbl_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	String name;
	String surname;
	String email;
	String phone;
	String graduated_school;
	String graduaed_year;
	String oldCompanyName;
	String oldCompanyExperienceYear;
	String password;
	boolean isupdate;
	
	@Column(columnDefinition="text")
	String oldCompanyWorkDescription;
	
	@Column(columnDefinition="text")
	String about;

	
	
	
	
	
	public User(Integer id, String name, String surname, String email, String phone, String graduated_school,
			String graduaed_year, String oldCompanyName, String oldCompanyExperienceYear, String password,
			String oldCompanyWorkDescription, String about, boolean isupdate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.graduated_school = graduated_school;
		this.graduaed_year = graduaed_year;
		this.oldCompanyName = oldCompanyName;
		this.oldCompanyExperienceYear = oldCompanyExperienceYear;
		this.password = password;
		this.oldCompanyWorkDescription = oldCompanyWorkDescription;
		this.about = about;
		this.isupdate=isupdate;
	}
	
	
	

	public User() {
		super();
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGraduated_school() {
		return graduated_school;
	}
	public void setGraduated_school(String graduated_school) {
		this.graduated_school = graduated_school;
	}
	public String getGraduaed_year() {
		return graduaed_year;
	}
	public void setGraduaed_year(String graduaed_year) {
		this.graduaed_year = graduaed_year;
	}
	public String getOldCompanyName() {
		return oldCompanyName;
	}
	public void setOldCompanyName(String oldCompanyName) {
		this.oldCompanyName = oldCompanyName;
	}
	public String getOldCompanyExperienceYear() {
		return oldCompanyExperienceYear;
	}
	public void setOldCompanyExperienceYear(String oldCompanyExperienceYear) {
		this.oldCompanyExperienceYear = oldCompanyExperienceYear;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOldCompanyWorkDescription() {
		return oldCompanyWorkDescription;
	}
	public void setOldCompanyWorkDescription(String oldCompanyWorkDescription) {
		this.oldCompanyWorkDescription = oldCompanyWorkDescription;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public boolean getIsupdate() {
		return isupdate;
	}
	public void setIspdate(boolean isupdate) {
		this.isupdate = isupdate;
	}
}

