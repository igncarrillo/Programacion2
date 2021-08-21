package ar.edu.um.clase7jpa.service;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.model.Persona;
import ar.edu.um.clase7jpa.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private IPersonaRepository repository;

    public PersonaService(@Autowired IPersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona findById(String id) throws PersonaNotFoundException {
        return repository.findById(Long.parseLong(id)).orElseThrow(() -> new PersonaNotFoundException(id));
    }

    @Override
    public Persona addPersona(Persona persona) {
        repository.save(persona);
        return persona;
    }

    @Override
    public Persona modifyPersona(Persona persona, String id) throws PersonaNotFoundException {
        Persona toUpdate = repository.findById(Long.parseLong(id)).orElseThrow(() -> new PersonaNotFoundException(id));
        toUpdate.setName(persona.getName());
        toUpdate.setLastName(persona.getLastName());
        toUpdate.setDni(persona.getDni());
        toUpdate=repository.save(toUpdate);
        return toUpdate;
    }

    @Override
    public String deletePersona(String id) throws PersonaNotFoundException {
        if (!repository.existsById(Long.parseLong(id))) {
            throw new PersonaNotFoundException(id);
        }
        String message = "La persona (id):" + id + " se borro correctamente";
        repository.deleteById(Long.parseLong(id));
        return message;

    }
}
