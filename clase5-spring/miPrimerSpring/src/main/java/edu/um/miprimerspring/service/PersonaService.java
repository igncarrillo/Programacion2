package edu.um.miprimerspring.service;

import edu.um.miprimerspring.exception.PersonaNotFoundException;
import edu.um.miprimerspring.model.PersonaDTO;
import edu.um.miprimerspring.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService {

    private IPersonaRepository repository;

    @Autowired
    public PersonaService( IPersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PersonaDTO> findAll() {
        return repository.findAll();
    }

    @Override
    public PersonaDTO findByDocumento(Long doc) throws PersonaNotFoundException {
        return repository.findPersonaByDocumento(doc).orElseThrow(()-> new PersonaNotFoundException(doc));
    }

    @Override
    public PersonaDTO addPersona(PersonaDTO personaDTO) {
        repository.addPersona(personaDTO);
        return personaDTO;
    }

    @Override
    public PersonaDTO update(PersonaDTO personaDTO, Long documento) {
        return repository.updatePersona(personaDTO,documento);
    }

    @Override
    public void deleteByDocumento(Long documento) {
        repository.deleteByDocumento(documento);
    }

}
