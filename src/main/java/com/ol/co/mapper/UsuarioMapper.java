package com.ol.co.mapper;

import com.ol.co.dto.UsuarioDTO;
import com.ol.co.model.Usuario;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper
public interface UsuarioMapper extends GenericMapper<Usuario, UsuarioDTO> {
	 public List<UsuarioDTO> entityListToDTOList(List<Usuario> usuarios);
}
