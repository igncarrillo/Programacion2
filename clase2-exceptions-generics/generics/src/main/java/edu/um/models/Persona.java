package edu.um.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Persona implements ISumador {
    private String nombre;
    private String apellido;
    private Integer edad;

    @Override
    public void sumar1() {
        this.edad++;
    }
}
