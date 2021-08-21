package edu.um.miprimerspring.controller;

import edu.um.miprimerspring.exception.PersonaNotFoundException;
import edu.um.miprimerspring.model.PersonaDTO;
import edu.um.miprimerspring.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/persona")
public class PersonaController extends BaseController {


    private IPersonaService service;

    @Autowired
    public PersonaController(IPersonaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> getPersonas() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{documento}")
    public ResponseEntity<PersonaDTO> getPersona(@PathVariable Long documento) throws PersonaNotFoundException {
        return new ResponseEntity<>(service.findByDocumento(documento), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PersonaDTO> addPersona(@Valid @RequestBody PersonaDTO personaDTO) {
        return new ResponseEntity<>(service.addPersona(personaDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{documento}")
    public ResponseEntity<PersonaDTO> update(@Valid @RequestBody PersonaDTO personaDTO, @PathVariable Long documento) {
        return new ResponseEntity<>(service.update(personaDTO, documento), HttpStatus.OK);
    }

    @DeleteMapping("/{documento}")
    public ResponseEntity<String> deleteByDocumento(@PathVariable Long documento) {
        service.deleteByDocumento(documento);
        return new ResponseEntity<>("La persona "+documento+" se ha borrado correctamente",HttpStatus.OK);
    }

}
