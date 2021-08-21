package ar.edu.um.clase7jpa.service;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.exception.TelefonoNotFoundException;
import ar.edu.um.clase7jpa.model.Telefono;
import ar.edu.um.clase7jpa.repository.ITelefonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TelefonoService implements ITelefonoService {

    private ITelefonoRepository repository;

    public TelefonoService(@Autowired ITelefonoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Telefono> findAll() {
        return repository.findAll();
    }

    @Override
    public Telefono findById(String id) throws TelefonoNotFoundException {
        return repository.findById(Long.parseLong(id)).orElseThrow(() -> new TelefonoNotFoundException(id));
    }

    @Override
    public Telefono addTelefono(Telefono telefono) {
        repository.save(telefono);
        return telefono;
    }

    @Override
    public Telefono modifyTelefono(Telefono telefono, String id) throws PersonaNotFoundException {
        Telefono toUpdate = repository.findById(Long.parseLong(id)).orElseThrow(() -> new PersonaNotFoundException(id));
        toUpdate.setNumber(telefono.getNumber());
        toUpdate.setPersona(telefono.getPersona());
        toUpdate.setType(telefono.getType());
        repository.save(toUpdate);
        return toUpdate;
    }

    @Override
    public String deleteTelefono(String id) throws TelefonoNotFoundException {
        if (!repository.existsById(Long.parseLong(id))) {
            throw new TelefonoNotFoundException(id);
        }
        String message = "El telefono (id):" + id + " se borro correctamente";
        repository.deleteById(Long.parseLong(id));
        return message;
    }
}
