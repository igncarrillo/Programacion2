package ar.edu.models;

import ar.edu.exceptions.OnlyMinorException;

public class OtherClass {

    public void verifyAge(Persona p) throws OnlyMinorException {
        if(p.getEdad()>=18){
            throw new OnlyMinorException("La edad proporcionada "+p.getEdad().toString()+" es invalida");
        }
    }
}
