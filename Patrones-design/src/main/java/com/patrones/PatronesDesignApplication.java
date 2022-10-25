package com.patrones;

import com.patrones.builder.PersonBuilderLombok;
import com.patrones.builder.PersonBuilderSinLombok;
import com.patrones.prototype.Person;
import com.patrones.singleton.PersonSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Cristian González Hens
 */
@SpringBootApplication
public class PatronesDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronesDesignApplication.class, args);

        //PATRON SINGLETON
        System.out.println("PATRÓN SINGLETON");

        PersonSingleton personSingleton = new PersonSingleton("Cristian", 30, "programador");
        System.out.println(personSingleton.hablar());
        System.out.println(personSingleton.decirFuncion());
        System.out.println("\n============\n");

        //PATRÓN PROTOTYPE
        System.out.println("PATRÓN PROTOTYPE");

        Person personProto = new Person("Cristian", 100);
        Person personProto2 = (Person) personProto.clone();

        System.out.println(personProto.getNombre() + " sueldo " + personProto.getSueldo());
        System.out.println(personProto2.getNombre() + " sueldo " + personProto2.getSueldo());

        //CAMBIAR NOMBRE DE OBJETO COPIADO
        System.out.println("\nCambiamos el nombre del objeto copiado\n");
        personProto2.setNombre("Mari Carmen");

        System.out.println(personProto.getNombre() + " sueldo " + personProto.getSueldo());
        System.out.println(personProto2.getNombre() + " sueldo " + personProto2.getSueldo());
        System.out.println("\n============\n");

        //PATRÓN BUILDER CON LOMBOK
        System.out.println("PATRÓN BUILDER LOOMBOK");
        PersonBuilderLombok personBuilderLoombokBuilder = PersonBuilderLombok.builder().nombre("Cristian").sueldo(100).build();
        System.out.println(personBuilderLoombokBuilder.getNombre() + " " + personBuilderLoombokBuilder.getSueldo());

        //PATRÓN BUILDER SIN LOMBOK
        System.out.println("PATRÓN BUILDER SIN LOOMBOK");
        PersonBuilderSinLombok personSinL = new PersonBuilderSinLombok.Builder().setNombre("Cristian").setSueldo(1000).build();
        System.out.println(personSinL.getNombre() + " sueldo " + personSinL.getSueldo());
    }


}
