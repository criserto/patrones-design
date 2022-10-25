package com.patrones.decorator.decorators;

import com.patrones.decorator.Person;

public class Becario extends Person {

    @Override
    public String hablar() {
        return "Soy " + super.getNombre() + " y estoy de prácticas";
    }

    @Override
    public double sueldoBonificacion(double cantidad) {
        return 0;
    }
}
