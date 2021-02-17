package com.xworkz.workzapp.city;

public class City {

	public CityWardDTO[] cityWardDTO;
	private int index;

	public City(int size) {
		cityWardDTO = new CityWardDTO[size];
	}

	public void saveCityWards(CityWardDTO cityWardDTO) {

		this.cityWardDTO[index++] = cityWardDTO;
	}

	public void getCityWardDetails() {

		for (int i = 0; i < cityWardDTO.length; i++) {
			if (cityWardDTO[i] != null) {
				System.out.println(cityWardDTO[i].getWardNo() + " " + cityWardDTO[i].getWardName() + " "
						+ cityWardDTO[i].getPopulation() + " " + cityWardDTO[i].getCorporatorName() + " "
						+ cityWardDTO[i].getArea());
			} else {
				System.out.println("No CityWard Details");
			}
		}
	}

	public void updateCityWardByPopulation(int wardNo, long population) {
		if (population > 0) {
			for (int i = 0; i < cityWardDTO.length; i++) {
				if (cityWardDTO[i].getWardNo() == wardNo) {

					cityWardDTO[i].setPopulation(population);

				}

			}

		}
	}

	public void deleteCityWardByWardNo(int wardNo) {

		for (int i = 0; i < cityWardDTO.length; i++) {
			if (cityWardDTO[i].getWardNo() == wardNo) {

				cityWardDTO[i] = null;

			} else {
				System.out.println("no wardNo found");
			}

		}

	}
	
	

}
