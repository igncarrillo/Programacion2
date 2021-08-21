package edu.um.miprimerspring.repository;

import edu.um.miprimerspring.model.PersonaDTO;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonaRepository implements IPersonaRepository {

    private Map<Long, PersonaDTO> personas = new HashMap<>();

    @Override
    public List<PersonaDTO> findAll() {
        return new ArrayList<>(personas.values());
    }

    @Override
    public Optional<PersonaDTO> findPersonaByDocumento(Long doc) {
        return Optional.ofNullable(personas.get(doc));
    }

    @Override
    public PersonaDTO addPersona(PersonaDTO personaDTO) {
        personas.put(personaDTO.getDocumento(), personaDTO);
        return personas.get(personaDTO.getDocumento());
    }

    @Override
    public PersonaDTO updatePersona(PersonaDTO personaDTO, Long documento) {
        PersonaDTO persona = findPersonaByDocumento(documento).get();
        persona.setNombre(personaDTO.getNombre());
        return persona;

    }

    @Override
    public void deleteByDocumento(Long documento) {
        personas.remove(documento);
    }


}
