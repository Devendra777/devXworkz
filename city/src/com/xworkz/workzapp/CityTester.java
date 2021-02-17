package com.xworkz.workzapp;

import java.util.Scanner;

import com.xworkz.workzapp.city.City;
import com.xworkz.workzapp.city.CityWardDTO;
import com.xworkz.workzapp.constants.Constants;

import static  com.xworkz.workzapp.constants.Constants.*;

public class CityTester {

	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		

		City city = new City(size);
		System.out.println(city);
		

		for (int i = 0; i < size; i++) {
			System.out.println("Enter the ward No");
			int wardNo = sc.nextInt();
		
			System.out.println("Enter the population");
			long population = sc.nextLong();
			System.out.println("Enter the corporator Name");
			String coName = sc.next();
			System.out.println("Enter the area size");
			String area = sc.next();
			CityWardDTO cityWardDTO = new CityWardDTO();

			cityWardDTO.setWardNo(wardNo);
			cityWardDTO.setWardName(RAJAJINAGAR);
			cityWardDTO.setPopulation(population);
			cityWardDTO.setCorporatorName(coName);
			cityWardDTO.setArea(area);
			
			city.saveCityWards(cityWardDTO);
		}
	
		
		city.getCityWardDetails();
		
		city.updateCityWardByPopulation(123, 570000);
		city.getCityWardDetails();
		
		
		city.deleteCityWardByWardNo(123);
		city.getCityWardDetails();
		
		System.out.println(city.cityWardDTO.length);
		
	}
	
}
