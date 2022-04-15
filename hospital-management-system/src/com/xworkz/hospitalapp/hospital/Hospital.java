package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;

public interface Hospital {
	
	
	
	public boolean createPatientDetails(PatientDTO dto) ;

	public void getAllPatientDetails() ;

	public PatientDTO getPatientById(int patientId) ;	
	
	public boolean updateContactNoByPatientName(long contactNo , String patientName);
	
	public boolean deletePatientById(int patientId) ;

	public  PatientDTO   getPatientByName(String name);
	public  PatientDTO   getPatientByGender(Gender gender);
	public   PatientDTO  getPatientByContactNo(long contactNo);
	// PatientDTO  getPatientByAge
	//  PatientDTO  getPatientByAddress
	
	
	  //  nameOfPatient  getPatientNameById
	 //  patientId   getPatientIdByName
	 //  patientAddress   getPatientAddressByName
	 //   Gender  getGenderByPatientName

}
