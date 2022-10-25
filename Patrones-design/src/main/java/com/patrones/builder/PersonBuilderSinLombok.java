package com.patrones.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonBuilderSinLombok {

    private String nombre;
    private double sueldo;

    public PersonBuilderSinLombok(String nombre, double sueldo) {
        super();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

        public static class Builder {
            private String nombre;
            private double sueldo;

            public PersonBuilderSinLombok build() {
                return new PersonBuilderSinLombok(this.nombre, this.sueldo);
            }

            public Builder setNombre(String nombre) {
                this.nombre = nombre;
                return this;
            }

            public Builder setSueldo(double sueldo) {
                this.sueldo = sueldo;
                return this;
            }
        }
    }

