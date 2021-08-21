package edu.um;

import edu.um.models.Generica;
import edu.um.models.OtraGenerica;
import edu.um.models.Persona;
import edu.um.models.Punto;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.implementarGenerica();
        app.implementarGenerica2();
    }

    private void implementarGenerica2() {
        OtraGenerica<Punto> punto = new OtraGenerica<>(new Punto(1.2,3.4));
        punto.mostrarTipo();
        System.out.println("El valor es: "+punto.getOb());
        punto.sumar1();
        System.out.println("El valor es: "+punto.getOb());

        OtraGenerica<Persona> persona = new OtraGenerica<>(new Persona("Ignacio","Carrillo",20));
        persona.mostrarTipo();
        System.out.println("El valor es: "+persona.getOb());
        persona.sumar1();
        System.out.println("La valor es: "+persona.getOb());
    }

    private void implementarGenerica() {
        Generica<Integer> inobject = new Generica<>(10);
        inobject.mostrarTipo();
        System.out.println("El valor es: "+inobject.getOb());

        Generica<String> sobject = new Generica<>("Ignacio");
        sobject.mostrarTipo();
        System.out.println("El valor es: "+sobject.getOb());

        Generica<Punto> punto = new Generica<>(new Punto(1.3,4.3));
        punto.mostrarTipo();
        System.out.println("El valor es: "+punto.getOb());
        System.out.println("------------------------------");
    }
}
