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
@Table(name = "Sesiones")
public class Sesion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSesion;

    @ManyToOne
    @JoinColumn(name = "ID_Usuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, length = 100)
    private String nombreSesion;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria", nullable = false)
    private Categoria categoria;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaSesion;
}