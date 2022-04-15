package com.xworkz.hospitalapp.hospital.impl;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalImpl implements Hospital{
	
	 
	
	
	 // One - many
	 public  PatientDTO  patientDTO[] ;
	 int index ; 
	 
	 // int a[] = new int[5];
	 // int a[] = {1,6,7,8,"",9};
	 
	 public HospitalImpl(int size) {
		 patientDTO = new PatientDTO[size] ;
	}
	 

	@Override
	public boolean createPatientDetails(PatientDTO dto) {
		 System.out.println("invoked createPatientDetails()");
	   boolean patientAdded = false ; 
	   if(dto != null ) {
		  patientDTO[index++] =  dto;
		  
		  patientAdded = true ; 
	   }
	   else {
		   System.out.println("No patient found");
	   }
	   System.out.println("end of createPatientDetails");
	return patientAdded ;
	}
	
	
	@Override
	public void getAllPatientDetails() {
		
		System.out.println("inside getPatientDetails ()... fetching the data");
		for (int i = 0; i < patientDTO.length; i++) {
			System.out.println(patientDTO[i]);
		}
		System.out.println("end of getPatientDetails()");
		
	}

	@Override
	public boolean updateContactNoByPatientName(long contactNo, String patientName){
		System.out.println("invoked updateContactNoByPatientName()");
		System.out.println("1st arg : Conactno :"+ contactNo);
		
		System.out.println("2nd arg : patient name :"+ patientName);
		boolean isContactNoUpdated = false ;
		for (int i = 0; i < patientDTO.length; i++) {
			
			if(patientDTO[i].getPatientName().equals(patientName)) {
				  patientDTO[i].setContactNo(contactNo);
				  isContactNoUpdated = true ;  
			}
			else {
				// code 
			}	 
		}
		return isContactNoUpdated;
	}


	@Override
	public boolean deletePatientById(int patientId){
		System.out.println("inside deletePatientById() ");	
		for (int i = 0; i < patientDTO.length; i++) {
			if(patientDTO[i].getPatientId() == patientId) { 
			       
				patientDTO[i] = null ;
		
			}
			else {
				 // code
			}
	 }
		return false;
	}


	@Override
	public PatientDTO getPatientById(int patientId) {
		PatientDTO patientDTO = null ;
		System.out.println("inside getPatientById ()");
		System.out.println("arg 1 Patient Id : "+ patientId );
		for (int i = 0; i < this.patientDTO.length; i++) {
			if(this.patientDTO[i].getPatientId() == patientId) {
				patientDTO = this.patientDTO[i];
			}
			else {
				// code 
			}
		}
		return patientDTO;
		
	}


	@Override
	public PatientDTO getPatientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PatientDTO getPatientByGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PatientDTO getPatientByContactNo(long contactNo) {
		// TODO Auto-generated method stub
		return null;
	}
}
