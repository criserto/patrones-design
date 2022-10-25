package com.patrones.decorator.decorators;

import com.patrones.decorator.Person;

public class Empleado  extends PersonDecorator{

    public Empleado(Person person) {
        super(person);
    }

    @Override
    public String hablar() {
        //SUELDO BASE
        this.person.setSueldo(1000);
        return "Soy " + this.person.getNombre() + " y estoy trabajando ahora gano " + this.person.getSueldo();
    }

    @Override
    public double sueldoBonificacion(double cantidad) {
        //PRIMAS
        return this.person.getSueldo() + cantidad;
    }
}
