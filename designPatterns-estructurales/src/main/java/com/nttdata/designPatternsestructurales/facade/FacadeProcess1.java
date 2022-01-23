package com.nttdata.designPatternsestructurales.facade;

import java.util.List;
import java.util.Random;

import com.nttdata.designPatternsestructurales.person.Person;

public class FacadeProcess1 implements FacadePersonInterface {

	@Override
	public List<Person> listIncrement(List<Person> lista) {
		String[] nombresArr = {"Lucas", "Fred", "Mancuérnidas", "Fausto", "Brutus"};
		int randomNumberName;
		int randomNumberAge;
		
		
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			randomNumberAge = (int) Math.floor(Math.random()*(20-30) + 30);
			randomNumberName = (int) Math.floor(Math.random()* nombresArr.length);

			lista.add(new Person(nombresArr[randomNumberName], randomNumberAge));
			
		}
		return lista;
	}

}
