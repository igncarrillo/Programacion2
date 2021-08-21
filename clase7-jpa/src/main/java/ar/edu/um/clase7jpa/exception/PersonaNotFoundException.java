package ar.edu.um.clase7jpa.exception;

import org.springframework.http.HttpStatus;

public class PersonaNotFoundException extends BaseException {

    public PersonaNotFoundException(String id) {
        super("La persona no existe (id:" + id + ")", HttpStatus.NOT_FOUND);
    }

}
