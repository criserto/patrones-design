package com.patrones.decorator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    private String nombre;
    private double sueldo;


    public abstract String hablar();
    public abstract double sueldoBonificacion(double cantidad);
}
