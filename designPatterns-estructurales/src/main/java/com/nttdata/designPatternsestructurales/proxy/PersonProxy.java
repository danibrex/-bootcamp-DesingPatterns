package com.nttdata.designPatternsestructurales.proxy;

public class PersonProxy implements PersonProxyInterface {
	private PersonProxyInterface person;
		
	
	public PersonProxy(PersonProxyInterface person) {
		super();
		this.person = person;
	}

	@Override
	public void operation() {
		before();
		person.operation();
		after();

	}
	
	public void before() {
		System.out.println("Ejecutado antes de la operación");
	}
	
	public void after() {
		System.out.println("Ejecutado después de la operación");
	}

}
