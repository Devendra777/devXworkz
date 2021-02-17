package com.xworkz.workzapp.city;

import com.xworkz.workzapp.constants.Constants;

public class CityWardDTO {

	private int wardNo;
	private Constants wardName;
	private String corporatorName;
	private long population;
	private String area;

	public CityWardDTO() {
		System.out.println(this.getClass().getSimpleName() +"Object is created");
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}


	public String getCorporatorName() {
		return corporatorName;
	}

	public void setCorporatorName(String corporatorName) {
		this.corporatorName = corporatorName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Constants getWardName() {
		return wardName;
	}

	public void setWardName(Constants wardName) {
		this.wardName = wardName;
	}

}
