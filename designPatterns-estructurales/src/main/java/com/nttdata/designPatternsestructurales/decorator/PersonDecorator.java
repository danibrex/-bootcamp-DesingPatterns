package com.nttdata.designPatternsestructurales.decorator;

import com.nttdata.designPatternsestructurales.person.Person;

public class PersonDecorator {
	private Person persona;
	
	public PersonDecorator(Person persona) {
		this.persona = persona;
	}
	
	public String getName() {
		return this.persona.getName() + " Alias 'El Decorado', 10 años más viejo";
	}
	
	public int getAge() {	
		return persona.getAge() + 10;
	}
}
