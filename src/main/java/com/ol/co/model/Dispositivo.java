package com.ol.co.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idArea")
    private Area area;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "idTipoDispositivo")
    private TipoDispositivo tipoDispositivo;

    @ManyToOne
    @JoinColumn(name = "idModelo")
    private Modelo modelo;

    private String numeroSerie;
    private String numeroInventario;
    private String comentario;

}