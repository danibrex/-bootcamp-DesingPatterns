package com.nttdata.designPatternsestructurales.main;

import com.nttdata.designPatternsestructurales.decorator.PersonDecorator;
import com.nttdata.designPatternsestructurales.facade.FacadeCreatePersonList;
import com.nttdata.designPatternsestructurales.person.Person;
import com.nttdata.designPatternsestructurales.proxy.PersonProxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***********************decorator****************************/
		System.out.println("************ decorator************");
		
		Person person1 = new Person("person1",60);		
		PersonDecorator personDecorator = new PersonDecorator(person1);
		
		System.out.println(
				"Name : " + person1.getName()
				+ "\nAge: " + person1.getAge()
				+ "\npersona decorada"
				+ "\nName: " + personDecorator.getName() 
				+ "\nAge: " + personDecorator.getAge()
		);
		
		/***********************Facade****************************/
		System.out.println("************Facade************");
		
		FacadeCreatePersonList facadeCreatePersonList = new FacadeCreatePersonList(); 
		
		facadeCreatePersonList.facadeCall(facadeCreatePersonList.getPersonsList());	
		facadeCreatePersonList.facadeShowList();
		
		/***********************proxy****************************/		
		System.out.println("************Proxy************");
		
		PersonProxy personProxy = new PersonProxy(person1);
		personProxy.operation();

	}

}
