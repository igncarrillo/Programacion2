package ar.edu.um.clase7jpa.controller;

import ar.edu.um.clase7jpa.exception.PersonaNotFoundException;
import ar.edu.um.clase7jpa.exception.TelefonoNotFoundException;
import ar.edu.um.clase7jpa.model.Telefono;
import ar.edu.um.clase7jpa.service.ITelefonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/telefono")
public class TelefonoController extends BaseController {

    private ITelefonoService service;

    public TelefonoController(@Autowired ITelefonoService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<List<Telefono>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Telefono> findById(@PathVariable String id) throws TelefonoNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Telefono> addTelefono(@RequestBody @Valid Telefono telefono) {
        return new ResponseEntity<>(service.addTelefono(telefono), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Telefono> modifyTelefono(@RequestBody @Valid Telefono telefono, @PathVariable String id) throws PersonaNotFoundException {
        return new ResponseEntity<>(service.modifyTelefono(telefono, id), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTelefono(@PathVariable String id) throws TelefonoNotFoundException {
        return new ResponseEntity<>(service.deleteTelefono(id), HttpStatus.OK);
    }
}
