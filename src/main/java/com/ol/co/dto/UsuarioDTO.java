package com.ol.co.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    private Long idUsuario;
    private String tipoIdentificacion;
    private String numIdentificacion;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;
    private String telefono;
    private String usuario;
    private String contraseña;
    private Long idRol; 
    private Long idArea;

}
