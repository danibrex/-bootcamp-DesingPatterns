package com.nttdata.designPatterns.singleton;

import com.nttdata.designPatterns.model.Person;

public class SingletonPerson {
	
	private static Person INSTANCE;
	
	private SingletonPerson() {		
	}
	
	//implementacion Lazy
	public static Person getInstance() {		
		if (INSTANCE == null) {			
			INSTANCE = new Person();			
		}		
		return INSTANCE;
	}

}
