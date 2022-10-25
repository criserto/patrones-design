package com.patrones.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private static Person person;
    private String nombre;
    private int edad;

    private Person(){}

    public static Person getPerson(){

        if(person == null){
            person = new Person();
        }
        return person;
    }

    public String sayHello(){
        return "Hola soy " + nombre + " tengo " + edad + " años";
    }
}
