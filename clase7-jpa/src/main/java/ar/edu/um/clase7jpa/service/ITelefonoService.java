package ar.edu.um.clase7jpa.service;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.exception.TelefonoNotFoundException;
import ar.edu.um.clase7jpa.model.Telefono;

import java.util.List;

public interface ITelefonoService {
    List<Telefono> findAll();

    Telefono findById(String id) throws TelefonoNotFoundException;

    Telefono addTelefono(Telefono telefono);

    Telefono modifyTelefono(Telefono telefono, String id) throws PersonaNotFoundException;

    String deleteTelefono(String id) throws TelefonoNotFoundException;
}
