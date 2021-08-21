package edu.um.miprimerspring.controller;

import edu.um.miprimerspring.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class BaseController {

    @GetMapping("/helloworld")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<>("HelloWorld", HttpStatus.OK);
    }

    //Manejador de excepciones de validacion
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<String> handleMethodArgumentNotValid(MethodArgumentNotValidException ex){
        return new ResponseEntity<>(Objects.requireNonNull(ex.getBindingResult().getFieldError()).getDefaultMessage(),HttpStatus.BAD_REQUEST);
    }

    //Manejador de excepciones de tipo
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex){
        return new ResponseEntity<>("El tipo de dato ingresado es incorrecto",HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<String> baseExceptionHandler(BaseException ex){
        return new ResponseEntity<>(ex.getMessage(),ex.getStatus());
    }
}
