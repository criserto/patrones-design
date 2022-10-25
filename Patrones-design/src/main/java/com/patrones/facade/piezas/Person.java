package com.patrones.facade.piezas;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private Mano mano;
    private Ojos ojos;
    private Pierna pierna;
    private int edad;
}
