package com.patrones.facade;

import com.patrones.facade.piezas.Mano;
import com.patrones.facade.piezas.Ojos;
import com.patrones.facade.piezas.Person;
import com.patrones.facade.piezas.Pierna;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PersonFacade {


    public static List<Person> personList(int numManos, int numOjos, String colorOjos, int numPiernas){

        Mano mano = new Mano(numManos);
        Ojos ojo = new Ojos(colorOjos, numOjos);
        Pierna pierna = new Pierna(numPiernas);

        List<Person> listPerson = new ArrayList<>();

        IntStream it = IntStream.range(20,31);

        it.forEach(n->{
            Person person = new Person(mano,ojo,pierna, n);
            listPerson.add(person);
        });

        /* OTRA FORMA DE CREARLOS.
        for (int i = 20; i <= 30; i++) {
            Person person = new Person(mano,ojo,pierna, i);
            listPerson.add(person);
        } */

        return listPerson;

    }

}
