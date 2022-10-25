package com.patrones.prototype;

public abstract class PersonAbstract {

    private String nombre;

    protected PersonAbstract(String nombre) {
        super();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
