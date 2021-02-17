package com.xworkz.workzapp.hospital;

public class Hospital {

// declaring and initializing the array
	public PatientsDTO[] patient;
	int index;

	public Hospital(int size) {
		System.out.println("Hospital object is created");
		System.out.println("initialize the patient array using size");
		// TODO Auto-generated constructor stub
		patient = new PatientsDTO[size];
	}

	public void addPatients(PatientsDTO patientsDTO) {
		System.out.println("inside addPatients method");
		if (patientsDTO.getName() != null) {
			System.out.println("adding patients details");
			patient[index++] = patientsDTO;
		}

	}

	public void getPatientDetails() {
		System.out.println("inside getPatientDetails method");
		for (int i = 0; i < patient.length; i++) {
			System.out.println(patient[i].getName() + " " + patient[i].getPatientId() + " " + patient[i].getAddress());

		}

	}

	public void getPatientsByName(String patientName) {
		System.out.println("inside getPatientByName method");

		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getName().equals(patientName)) {
				System.out.println(
						patient[i].getName() + " " + patient[i].getPatientId() + " " + patient[i].getAddress());
			}

		}
	}

	public boolean updatePatientAddressByPatientName(String name, String address) {
		boolean check = false;

		for (PatientsDTO patientsDTO : patient) {

			if (patientsDTO.getName().equals(name)) {
				patientsDTO.setAddress(address);
				check = true;
				System.out.println("Successfully updated the address");
			} else {
				System.out.println("No Patient Found");
			}

		}
		return check;

	}

}
