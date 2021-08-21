package ar.edu.um.clase7jpa.service;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.model.Persona;

import java.util.List;

public interface IPersonaService {
    List<Persona> findAll();

    Persona findById(String id) throws PersonaNotFoundException;

    Persona addPersona(Persona persona);

    Persona modifyPersona(Persona persona, String id) throws PersonaNotFoundException;

    String deletePersona(String id) throws PersonaNotFoundException;
}
