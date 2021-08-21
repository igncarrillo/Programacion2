package ar.edu.um.clase7jpa.controller;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.model.Persona;
import ar.edu.um.clase7jpa.service.IPersonaService;
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

    public PersonaController(@Autowired IPersonaService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Persona>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findById(@PathVariable String id) throws PersonaNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Persona> addPersona(@RequestBody @Valid Persona persona) {
        return new ResponseEntity<>(service.addPersona(persona), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> modifyPersona(@RequestBody @Valid Persona persona, @PathVariable String id) throws PersonaNotFoundException {
        return new ResponseEntity<>(service.modifyPersona(persona, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePersona(@PathVariable String id) throws PersonaNotFoundException {
        return new ResponseEntity<>(service.deletePersona(id), HttpStatus.OK);
    }
}
