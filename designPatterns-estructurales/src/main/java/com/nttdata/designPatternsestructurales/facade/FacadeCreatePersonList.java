package com.nttdata.designPatternsestructurales.facade;

import java.util.ArrayList;
import java.util.List;

import com.nttdata.designPatternsestructurales.person.Person;

public class FacadeCreatePersonList {
	
	private List<Person> personsList = new ArrayList<>();
	
	public FacadeCreatePersonList() {}


	public List<Person> getPersonsList() {
		return personsList;
	}

	public void setPersonsList(List<Person> personsList) {
		this.personsList = personsList;
	}
	
	public void facadeCall(List<Person> personsList) {
		
		FacadeProcess1 fp1 = new FacadeProcess1();
		FacadeProcess2 fp2 = new FacadeProcess2();
		FacadeProcess3 fp3 = new FacadeProcess3();
		
		personsList = fp1.listIncrement(personsList);
		personsList = fp2.listIncrement(personsList);
		personsList = fp3.listIncrement(personsList);
	}
	
	public void facadeShowList() {
		
		personsList.stream().forEach(t -> System.out.println("Name: " + t.getName() + "\nAge: " + t.getAge()));
		System.out.println("Tamaño de la lista " + personsList.size());

	}


}
