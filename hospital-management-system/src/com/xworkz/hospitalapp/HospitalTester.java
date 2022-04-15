package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.hospital.impl.HospitalImpl;

public class HospitalTester {
	
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
	  int size = 	sc.nextInt() ; 
		Hospital hospital = new HospitalImpl(size);
		
		for (int i = 0; i < size; i++) {
			
			PatientDTO dto = new PatientDTO();
			System.out.println("Enter the Id");
			dto.setPatientId(sc.nextInt());
			System.out.println("Enter the Address");
			dto.setAddress(sc.next());
			System.out.println("Enter the Gender");
			String gender = sc.next() ; 
			dto.setGender(Gender.valueOf(gender));
			System.out.println("Enter the Age");
			dto.setAge(sc.nextInt());
			System.out.println("Enter the Disease name");
			dto.setDisease(sc.next());
			System.out.println("Enter the Contact No");
			dto.setContactNo(sc.nextLong());
			System.out.println("Enter the Patient Name");
			dto.setPatientName(sc.next());
			
			System.out.println(hospital.createPatientDetails(dto));
		
		}
	
		String text = null ;
		
		do {
			System.out.println("Enter 1 to get the Patient Details By Id");
			System.out.println("Enter 2 to get All the Patient Details ");
			System.out.println("Enter 3 to update the Patient Contact No By Patient Name  ");
			int choice = sc.nextInt();
			switch (choice) {
			       
			case 1:  System.out.println("Enter the Id");
		          System.out.println(hospital.getPatientById(sc.nextInt()));
		           break ;
			case 2 :
				   hospital.getAllPatientDetails();
				   break ;
			case 3 : //code to invoke updateContactNoByPatientName method
				break ; 
		  default:
			   System.out.println("No Choice Available ...");
			
			}
			System.out.println("Do you want to continue say Yes/No");
		text =  sc.next();
		}while(text.equalsIgnoreCase("Yes"));
	}
	
	
}
