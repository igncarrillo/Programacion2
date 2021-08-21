package ar.edu.um.clase7jpa.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Validated
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name can not be empty")
    private String name;
    @NotBlank(message = "lastname can not be empty")
    private String lastName;
    @Pattern(regexp = "^[0-9]{8}", message = "dni format must be xxxxxxxx")
    @NotNull
    private String dni;

    //lo comento para que no me devuelve recursion infinita en la persona
/*    @OneToMany(mappedBy = "persona")
    @Valid
    private List<Telefono> telefonos;*/

    public Persona(Long id, String name, String lastName, String dni) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }
}
