package edu.um.miprimerspring.repository;

import edu.um.miprimerspring.model.PersonaDTO;

import java.util.List;
import java.util.Optional;

public interface IPersonaRepository {
    List<PersonaDTO> findAll();

    Optional<PersonaDTO> findPersonaByDocumento(Long doc);

    PersonaDTO addPersona(PersonaDTO personaDTO);

    PersonaDTO updatePersona(PersonaDTO personaDTO, Long documento);

    void deleteByDocumento(Long documento);
}
