package com.patrones.prototype;

public class Person extends PersonAbstract implements IClon {

    double sueldo;

    public Person(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public PersonAbstract clone() {
        return new Person(this.getNombre(), this.sueldo);
    }
}
