package edu.um.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Punto implements ISumador {
    private Double x;
    private Double y;

    @Override
    public void sumar1() {
        this.x++;
        this.y++;
    }
}
