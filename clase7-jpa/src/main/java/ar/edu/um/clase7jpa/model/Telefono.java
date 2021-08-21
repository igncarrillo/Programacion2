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

@Entity
@Getter
@Setter
@NoArgsConstructor
@Validated
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "type can not be blank")
    private String type;
    @Pattern(regexp = "^[0-9]{7,9}", message = "number length must be between 7 and 9")
    @NotNull
    private String number;

    @ManyToOne(optional = false)
    @JoinColumn(name = "persona_id",nullable = false)
    @Valid
    private Persona persona;
}
