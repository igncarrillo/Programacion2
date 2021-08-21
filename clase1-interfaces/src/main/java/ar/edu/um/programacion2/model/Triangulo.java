package ar.edu.um.programacion2.model;

import ar.edu.um.programacion2.interfaces.IFigura;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Triangulo implements IFigura {
    List<Punto> vertices = new ArrayList<>();

    public Triangulo() {
        vertices.add(new Punto(10, 10));
        vertices.add(new Punto(20, 10));
        vertices.add(new Punto(15, 0));
    }

    @Override
    public void muestraPuntos() {
        for (Punto punto : vertices) {
            System.out.println(punto.toString());
        }
    }
}
