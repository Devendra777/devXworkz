package com.xworkz.comparator;

import java.util.Comparator;

import com.xworkz.collectionapp.dto.PatientDTO;

public class PatientNameComparator implements Comparator<PatientDTO> {

	@Override
	public int compare(PatientDTO o1, PatientDTO o2) {
		return o1.getPatientName().compareTo(o2.getPatientName());
	}

}
