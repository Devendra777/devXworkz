package com.workz.workzapp.dto;

public class Trekking {

	private String place;
	private int members;
	private float cost;

	public Trekking() {
		// TODO Auto-generated constructor stub
	enenjoying(place);
	}
	
	
	public Trekking(String place, float cost) {
		// TODO Auto-generated constructor stub
		this.place=place;
		this.cost = cost;
	}
	
	public Trekking(int members) {
		// TODO Auto-generated constructor stub
		this.members=members;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setMembers(int members) {
		this.members = members;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPlace() {
		return place;

	}

	public float getCost() {
		return cost;
	}

	public int getMembers() {
		return members;
	}

	public void enjoying() {
		System.out.println("Enjoying with freinds");

	}
	
	public void enenjoying(String place)
	{
		
	}

}
