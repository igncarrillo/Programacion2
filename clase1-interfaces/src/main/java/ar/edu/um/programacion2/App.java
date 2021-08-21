package ar.edu.um.programacion2;

import ar.edu.um.programacion2.interfaces.IFigura;
import ar.edu.um.programacion2.model.Cuadrado;
import ar.edu.um.programacion2.model.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("hello world");
        List<IFigura> figuras = new ArrayList<>();
        figuras.add(new Triangulo());
        figuras.add(new Cuadrado());
        for (IFigura figura : figuras) {
            System.out.println(figura.toString());
            figura.muestraPuntos();
        }
    }

}