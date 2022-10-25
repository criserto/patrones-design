package com.patrones.decorator.decorators;

import com.patrones.decorator.Person;

public abstract class PersonDecorator  extends Person {

    protected Person person;

    protected PersonDecorator(Person person){
        super();
        this.person=person;
    }
}
