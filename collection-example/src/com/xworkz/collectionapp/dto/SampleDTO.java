package com.xworkz.collectionapp.dto;

import java.util.Set;

public class SampleDTO implements Comparable<SampleDTO> {

	private int id;
	private String name;

	public SampleDTO(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(SampleDTO dto) {
		return this.id - dto.id;
	}

	@Override
	public String toString() {
		return "SampleDTO [id=" + id + "]";
	}

}
