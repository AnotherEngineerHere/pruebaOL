package com.ol.co.dto;

import lombok.Data;

@Data
public class DispositivoDTO {
    private Long id;
    private String nombre;
    private Long idUsuario;
    private Long idArea;
    private Long idEstado;
    private Long idTipoDispositivo;
    private Long idModelo;
    private String numeroSerie;
    private String numeroInventario;
    private String comentario;
    
}