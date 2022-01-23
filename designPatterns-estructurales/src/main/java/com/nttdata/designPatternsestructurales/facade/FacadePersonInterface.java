package com.nttdata.designPatternsestructurales.facade;

import java.util.List;

import com.nttdata.designPatternsestructurales.person.Person;

public interface FacadePersonInterface {
	
	public abstract List<Person> listIncrement(List<Person> lista);
}
