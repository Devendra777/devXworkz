package com.workz.workzapp;

import com.workz.workzapp.dto.Trekking;

public class TrekkingTester {

	public static void main(String[] args) {

		Trekking dto = new Trekking();
		dto.setCost(3000.0f);
		dto.setMembers(34);
		dto.setPlace("kedarnath");

		Trekking trekking = new Trekking(67);
		System.out.println(trekking.getMembers());

		Trekking trekking2 = new Trekking("himalayas", 80000.00f);
		System.out.println(trekking2.getPlace() + " " + trekking2.getMembers() + " " + trekking2.getCost());

	}

}
