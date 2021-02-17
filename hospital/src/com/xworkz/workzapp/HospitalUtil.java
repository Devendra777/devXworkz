package com.xworkz.workzapp;

import java.util.Scanner;

import com.xworkz.workzapp.hospital.Hospital;
import com.xworkz.workzapp.hospital.PatientsDTO;

public class HospitalUtil {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		Hospital hospital = new Hospital(size);
		for (int i = 0; i < size; i++) {

			System.out.println("Enter the patiientId");
			int patientId = sc.nextInt();

			System.out.println("Enter the name");
			String name = sc.next();

			System.out.println("Enter the address");
			String address = sc.next();

			PatientsDTO patientsDTO = new PatientsDTO();
			patientsDTO.setPatientId(patientId);
			patientsDTO.setName(name);
			patientsDTO.setAddress(address);

			hospital.addPatients(patientsDTO);

		}

		// hospital.getPatientDetails();
		/*
		 * System.out.println("Enter the patient name"); String patientName = sc.next();
		 * hospital.getPatientsByName(patientName);
		 */
		System.out.println("Enter the patient name");
		String name = sc.next();
		System.out.println("Enter the new patient address");
		String address = sc.next();
		boolean check =hospital.updatePatientAddressByPatientName(name, address);
		System.out.println(check);
		hospital.getPatientDetails();
	}

}
