package com.nttdata.designPatterns.test;

import org.springframework.boot.CommandLineRunner;

import com.nttdata.designPatterns.lombok.LombokPerson;
import com.nttdata.designPatterns.lombok.LombokPersonC;
import com.nttdata.designPatterns.model.Person;
import com.nttdata.designPatterns.model.Person.PersonBuilder;
import com.nttdata.designPatterns.singleton.SingletonPerson;
import com.nttdata.designPatterns.singleton.SingletonPersonEnum;

public class Test implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/***********************SINGLETON****************************/
		
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		
		Person singletonPerson1 = SingletonPerson.getInstance();
		Person singletonPerson2 = SingletonPerson.getInstance();		
		//enum
		Person singletonPerson3 = SingletonPersonEnum.INSTANCE.getPerson();		
		Person singletonPerson4 = SingletonPersonEnum.INSTANCE.getPerson();
		
		singletonPerson1.setName("SingletonPerson1");
		singletonPerson2.setName("SingletonPerson2");
		singletonPerson3.setName("SingletonPerson3 ENUM");
		singletonPerson4.setName("SingletonPerson4 ENUM");	
		
		
		
		System.out.println("************ Singleton************");
		System.out.println(person1.getName() + " " + person1);
		System.out.println(person2.getName() + " " + person2);
		System.out.println("*******************************");
		System.out.println(singletonPerson1.getName() + " " + singletonPerson1);
		System.out.println(singletonPerson2.getName() + " " + singletonPerson2);
		System.out.println(singletonPerson3.getName() + " " + singletonPerson3);		
		System.out.println(singletonPerson4.getName() + " " + singletonPerson4);
		
		/***********************PROTOTYPE****************************/	
		
		System.out.println("************ prototype************");
		
		Person prototypePerson1 = new Person("prototypePerson1");
		Person prototypePerson2 = new Person("prototypePerson2");
		Person prototypePerson3 = prototypePerson1;		
		Person prototypePerson4 = (Person) prototypePerson1.clone();
		Person prototypePerson5 = (Person) prototypePerson1.clone();
		
		System.out.println("nombre: "  + prototypePerson1.getName() + " objeto1: " + prototypePerson1);
		System.out.println("nombre: "  + prototypePerson2.getName() + " objeto2: " + prototypePerson2);
		System.out.println("************ clonados o igualados************");
		System.out.println("nombre: "  + prototypePerson3.getName() + " objeto3 igualado con 1: " + prototypePerson3);
		System.out.println("nombre: "  + prototypePerson4.getName() + " objeto4 clon del 1: " + prototypePerson4);
		System.out.println("nombre: "  + prototypePerson5.getName() + " objeto5 clon del 1: " + prototypePerson5);
		
		System.out.println("************ ver hashcode************");
		
		System.out.println("nombre: "  + prototypePerson1.getName() + " objeto1: " + prototypePerson1.hashCode());
		System.out.println("nombre: "  + prototypePerson2.getName() + " objeto2: " + prototypePerson2.hashCode());
		System.out.println("************ clonados o igualados************");
		System.out.println("nombre: "  + prototypePerson3.getName() + " objeto3 igualado con 1: " + prototypePerson3.hashCode());
		System.out.println("nombre: "  + prototypePerson4.getName() + " objeto4 clon del 1: " + prototypePerson4.hashCode());
		System.out.println("nombre: "  + prototypePerson5.getName() + " objeto5 clon del 1: " + prototypePerson5.hashCode());
		
		if (prototypePerson1.equals(prototypePerson5)) {
			System.out.println("El objeto 1 y su clon 5 son iguales con equals");
		}else {
			System.out.println("El objeto 1 y su clon 5 No son iguales con equals");
		}
		
		prototypePerson5.setName("prototipePerson5 editado");
		
		if (prototypePerson1.equals(prototypePerson5)) {
			System.out.println("El objeto 1 y su clon 5 son iguales con equals");
		}else {
			System.out.println("El objeto 1 y su clon 5 No son iguales con equals \ntras cambiar el valor del nombre del 5");
		}
		
		/***********************BUILDER****************************/	
		
		System.out.println("************ Builder************");
		Person builderPerson1 = Person.PersonBuilder.builder().name("builderPerson1").age(78).build();
		Person builderPerson2 = Person.PersonBuilder.builder().name("builderPerson2").age(7).build();		
		System.out.println(builderPerson1.getName() + " " + builderPerson1.getAge());
		System.out.println(builderPerson2.getName() + " " + builderPerson2.getAge());
		
		/***********************LOMBOK****************************/	
		
		System.out.println("************ lombok************");
		
		LombokPerson lombokPerson1 = new LombokPerson("lombokPerson1", 12);
		LombokPerson lombokPerson2 = LombokPerson.builder().name("lombokPerson2").age(32).build();
		
		LombokPersonC lombokPersonC1 = new LombokPersonC();
		LombokPersonC lombokPersonC2 = new LombokPersonC();	
		
	
		
		Person prototypePersonLombok1 = lombokPersonC1.prototypePerson();
		Person singletonPersonLombok1 = lombokPersonC1.singletonPerson();
		
		Person prototypePersonLombok2 = lombokPersonC2.prototypePerson();
		Person singletonPersonLombok2 = lombokPersonC2.singletonPerson();
		

		prototypePersonLombok1.setName("prototypePersonLombok1");		
		singletonPersonLombok1.setName("singletonPersonLombok1");
		
		prototypePersonLombok2.setName("prototypePersonLombok2");		
		singletonPersonLombok2.setName("singletonPersonLombok2");		
		
		Person prototypePersonLombok3 = (Person) prototypePersonLombok2.clone();
		Person singletonPersonLombok3 = (Person) prototypePersonLombok3.builder().name("singletonPersonLombok3 con built").age(0).build();

		
		System.out.println(
				"NAME :" + lombokPerson1.getName() +
				"\nAGE " + lombokPerson1.getAge() +
				"\nobject " + lombokPerson1 + 
				"\nhashcode: " + lombokPerson1.hashCode()
		);
		System.out.println("******************************************");
		System.out.println(
				"NAME :" + lombokPerson2.getName() +
				"\nAGE " + lombokPerson2.getAge() +
				"\nobject " + lombokPerson2 + 
				"\nhashcode: " + lombokPerson2.hashCode()
		);
		System.out.println("******************************************");
		System.out.println(
				"NAME :" + prototypePersonLombok1.getName() +
				"\nobject " + prototypePersonLombok1 + 
				"\nhashcode: " + prototypePersonLombok1.hashCode()
		);
		System.out.println("******************************************");
		System.out.println(
				"NAME :" + singletonPersonLombok1.getName() +
				"\nobject " + singletonPersonLombok1 + 
				"\nhashcode: " + singletonPersonLombok1.hashCode()
		);
		System.out.println("******************************************");
		System.out.println(
				"NAME :" + prototypePersonLombok2.getName() +
				"\nobject " + prototypePersonLombok2 + 
				"\nhashcode: " + prototypePersonLombok2.hashCode()
		);
		System.out.println("******************************************");
		System.out.println(
				"NAME :" + singletonPersonLombok2.getName() +
				"\nobject " + singletonPersonLombok2 + 
				"\nhashcode: " + singletonPersonLombok2.hashCode()
		);
		System.out.println("*****************CLONE*************************");
		System.out.println(
				"NAME :" + prototypePersonLombok3.getName() +
				"\nobject " + prototypePersonLombok3 + 
				"\nhashcode: " + prototypePersonLombok3.hashCode()
		);
		System.out.println("****************Build*******************");
		System.out.println(
				"NAME :" + singletonPersonLombok3.getName() +
				"\nobject " + singletonPersonLombok3 + 
				"\nhashcode: " + singletonPersonLombok3.hashCode()
		);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
