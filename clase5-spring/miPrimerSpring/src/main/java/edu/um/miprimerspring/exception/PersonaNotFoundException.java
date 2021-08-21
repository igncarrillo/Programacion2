package edu.um.miprimerspring.exception;

import org.springframework.http.HttpStatus;

public class PersonaNotFoundException extends BaseException {
    public PersonaNotFoundException(Long doc) {
        super("No se encontro la persona con el dni: " + doc, HttpStatus.NOT_FOUND);
    }
}
