package com.nttdata.designPatterns.lombok;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nttdata.designPatterns.model.Person;

@Configuration
public class LombokPersonC {
	
	public LombokPersonC(){}

	@Bean(name = "PrototypePerson")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person singletonPerson() {
		return new Person();
	}

	@Bean(name = "SingletonPerson")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public Person prototypePerson() {
			return new Person();
	}

}
