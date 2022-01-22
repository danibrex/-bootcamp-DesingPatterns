package com.nttdata.designPatterns.singleton;

import com.nttdata.designPatterns.model.Person;

/*
 * Usando enums (la mejor forma nos indica.)
 */

public enum SingletonPersonEnum {
    INSTANCE;
    Person person;
    private SingletonPersonEnum() {
        this.person = new Person();
    }
    public Person getPerson() {
        return this.person;
    }
}
