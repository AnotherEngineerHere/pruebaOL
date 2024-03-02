package com.ol.co.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DispositivoDTO {
	
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Long getIdArea() {
		return idArea;
	}
	public void setIdArea(Long idArea) {
		this.idArea = idArea;
	}
	public Long getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Long idEstado) {
		this.idEstado = idEstado;
	}
	public Long getIdTipoDispositivo() {
		return idTipoDispositivo;
	}
	public void setIdTipoDispositivo(Long idTipoDispositivo) {
		this.idTipoDispositivo = idTipoDispositivo;
	}
	public Long getIdModelo() {
		return idModelo;
	}
	public void setIdModelo(Long idModelo) {
		this.idModelo = idModelo;
	}
	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public String getNumeroInventario() {
		return numeroInventario;
	}
	public void setNumeroInventario(String numeroInventario) {
		this.numeroInventario = numeroInventario;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
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