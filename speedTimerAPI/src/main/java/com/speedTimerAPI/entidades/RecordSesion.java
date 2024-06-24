package com.speedTimerAPI.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "RecordsSesion")
public class RecordSesion implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecordSesion;

    @ManyToOne
    @JoinColumn(name = "ID_Sesion", nullable = false)
    private Sesion sesion;

    @Column(nullable = false, length = 50)
    private String tipoRecord;

    @Column(nullable = false)
    private long valor;
}