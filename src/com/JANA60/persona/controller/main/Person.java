package com.JANA60.persona.controller.main;

public class Person {
	/*
	 * Creare una classe Persona con attributi nome e cognome e un attributo indirizzo di tipo Indirizzo, 
	 * dove Indirizzo è un’altra classe caratterizzata dagli attributi: via, numero e città.
		In una classe Main di test, 
		utilizzando lo scanner chiedete informazioni all’utente e create due persone diverse con i propri indirizzi. 
		Poi provate a modificare la città di una delle due persone senza che questa modifica influisca con i dati dell’altra persona
	 */
	
	private String name, surname;
	
	private Address address;
	
	//constructor
	public Person (String name, String surname, Address address)
	{
		this.name=name;
		this.surname= surname;
		
		this.address= new Address (address.getStreet(), address.getNum(), address.getCity());
		
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
