package com.nttdata.designPatterns.model;

import java.util.Objects;

import com.nttdata.designPatterns.prototype.PrototypePersonInterface;

import lombok.Builder;

@Builder
public class Person implements PrototypePersonInterface, Comparable{
	
	private String name;
	private int age;
	
	
	public Person() {		
	}
	
			
	public Person(String name) {
		this.name = name;
	}
	

	public Person(int age) {
		this.age = age;
	}


	private Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private Person(PersonBuilder personBuilder) {
		this.name = personBuilder.name;
		this.age = personBuilder.age;
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
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	@Override
	public PrototypePersonInterface clone() {
		Person person = new Person(name);
		return person;
	}
	
	
	/*
	 * Builder
	 */
	
	public static class PersonBuilder {
        private String name;
        private int age;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

		public static PersonBuilder builder() {
	        	return new PersonBuilder();
		}


    }


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
