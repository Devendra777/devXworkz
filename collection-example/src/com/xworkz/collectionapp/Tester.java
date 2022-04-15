package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import com.xworkz.collectionapp.constant.Gender;
import com.xworkz.collectionapp.dto.PatientDTO;
import com.xworkz.comparator.PatientNameComparator;


public class Tester {
	
	
	public static void main(String[] args) {
	
		// Set set = new ArrayList();
		List collection = new ArrayList();
		PatientDTO dto = new PatientDTO(1, "Hitesh", "Ganganagar", "Heart", 78, 7897897897L, Gender.male);
		PatientDTO dto1 = new PatientDTO(2, "Banu", "Bapujinagar", "BP", 89, 7897897899L, Gender.female);
		 
		collection.add(dto );
		 
		collection.add(dto1);
		
	
		PatientNameComparator comparator = new PatientNameComparator();
		
		// Utility class
		Collections.sort(collection, comparator);
     
		
		System.out.println(collection.size());
	
		System.out.println(collection.size());
		
		
		System.out.println("fetching the Objects from Collection");
		System.out.println("fetching the objects with forEach method");
		collection.forEach(System.out::println);
	
		
		System.out.println("fetching the objects with for each");
		for (Object object : collection) {
			System.out.println(object);
		}
		
		
	/*	
		Collection collection1 = new ArrayList();
		System.out.println(collection1.isEmpty());
		collection1.addAll(collection) ;
		collection1.add("bye");
		System.out.println(collection1.isEmpty());
	
		
		System.out.println("fetching the objects with for each");
		for (Object object : collection1) {
			System.out.println(object);
		}
		
	
	}*/
	}
}

