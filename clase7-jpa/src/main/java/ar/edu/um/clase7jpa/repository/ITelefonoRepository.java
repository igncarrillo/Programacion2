package ar.edu.um.clase7jpa.repository;

import ar.edu.um.clase7jpa.model.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITelefonoRepository extends JpaRepository<Telefono,Long> {
}
