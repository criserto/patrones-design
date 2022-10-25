package com.patrones.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonBuilderLombok {

    String nombre;

    double sueldo;
}
