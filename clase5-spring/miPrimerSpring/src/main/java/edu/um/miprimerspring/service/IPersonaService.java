package edu.um.miprimerspring.service;

import edu.um.miprimerspring.exception.PersonaNotFoundException;
import edu.um.miprimerspring.model.PersonaDTO;

import java.util.List;

public interface IPersonaService {
    List<PersonaDTO> findAll();

    PersonaDTO findByDocumento(Long doc) throws PersonaNotFoundException;

    PersonaDTO addPersona(PersonaDTO personaDTO);

    PersonaDTO update(PersonaDTO personaDTO, Long documento);

    void deleteByDocumento(Long documento);
}
