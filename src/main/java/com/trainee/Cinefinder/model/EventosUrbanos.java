package com.trainee.Cinefinder.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table (name = "EventosUrbanos")
public class EventosUrbanos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer id;
    @Column (name = "titulo")
    private String titulo;
    @Column (name = "descripcion")
    private String descripcion;
    @Column (name = "fecha")
    private Date fecha;
    @Column (name = "lugar")
    private String lugar;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categorias_id;
}
