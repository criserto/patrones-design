package com.patrones.singleton;

public class PersonSingleton {

    Person person = Person.getPerson();
    private String funcion;

    public PersonSingleton(String nombre, int edad, String funcion) {
        person.setNombre(nombre);
        person.setEdad(edad);
        this.funcion = funcion;
    }

    public String hablar() {
        return person.sayHello();
    }

    public String decirFuncion() {
        return "Mi función es la de " + funcion;
    }
}
