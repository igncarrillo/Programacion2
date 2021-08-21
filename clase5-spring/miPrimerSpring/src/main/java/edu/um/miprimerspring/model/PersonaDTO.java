package edu.um.miprimerspring.model;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class PersonaDTO {

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotNull(message = "El dni es obligatorio")
    private Long documento;

}
