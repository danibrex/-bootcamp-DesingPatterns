package com.nttdata.designPatternsestructurales.person;

import com.nttdata.designPatternsestructurales.proxy.PersonProxyInterface;

public class Person implements PersonProxyInterface{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void operation() {
		System.out.println("La clase person está ejecutando la operación");
	}
	
}
