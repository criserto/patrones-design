package com.patrones.decorator.decorators;

import com.patrones.decorator.Person;

public class Desempleado extends PersonDecorator{


    public Desempleado(Person person) {
        super(person);
    }

    @Override
    public String hablar() {
        this.person.setSueldo(0);
        return "Soy " + this.person.getNombre() + " y estoy desempleado";
    }

    @Override
    public double sueldoBonificacion(double cantidad) {
        return this.person.getSueldo();
    }
}
