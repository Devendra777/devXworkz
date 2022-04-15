package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constant.Gender;

public class PatientDTO {
	
	
	private int patientId;
	private String patientName;
	private String address;
	private String disease ; 
	private int age;
	private long contactNo;
	private Gender gender ; 
	
	
	public PatientDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getPatientName() {
		return patientName;
	}


	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDisease() {
		return disease;
	}


	public void setDisease(String disease) {
		this.disease = disease;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public Gender getGender() {
		return gender;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "PatientDTO [patientId=" + patientId + ", patientName=" + patientName + ", address=" + address
				+ ", disease=" + disease + ", age=" + age + ", contactNo=" + contactNo + ", gender=" + gender + "]";
	}
	
	
	

}
