package ar.edu.exceptions;

import java.io.IOException;

public class OnlyMinorException extends IOException {

    public OnlyMinorException(String message) {
        super(message);
    }
}
