package com.JANA60.persona.controller.main;

public class Address 
{

	private String street, city;
	private int num;
	
	

	public Address(String street, int num, String city)
	{
		this.street=street;
		this.num=num;
		this.city=city;
	}
	
	
	
	
	
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
