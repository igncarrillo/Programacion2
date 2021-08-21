package ar.edu.um.clase7jpa.exception;

import org.springframework.http.HttpStatus;

public class TelefonoNotFoundException extends BaseException {

    public TelefonoNotFoundException(String id) {
        super("El telefono no existe (id:" + id + ")", HttpStatus.NOT_FOUND);
    }

}
