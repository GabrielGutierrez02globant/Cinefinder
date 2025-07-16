package com.trainee.Cinefinder.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.jetbrains.annotations.NotNull;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "participaciones")
public class Participaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    @Column (name = "artista_dni")
    @NotNull
    @NotBlank
    @Valid
    private Long artista_dni;
    @Column (name = "tipo_evento")
    private String tipo_evento;
    @Column (name = "evento_id")
    private Integer evento_id;
}
