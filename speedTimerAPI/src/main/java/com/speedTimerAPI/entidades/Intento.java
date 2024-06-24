package com.speedTimerAPI.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Intentos")
public class Intento implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIntento;

    @ManyToOne
    @JoinColumn(name = "ID_Sesion", nullable = false)
    private Sesion sesion;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double tiempo;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;

    @Column(nullable = false, length = 255)
    private String mezcla;

    @Column(length = 255)
    private String comentario;
}