package com.patrones.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Person {

    String nombre;

    int sueldo;
}
