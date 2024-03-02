package com.ol.co.mapper;

import com.ol.co.dto.DispositivoDTO;
import com.ol.co.model.Dispositivo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface DispositivoMapper extends GenericMapper<Dispositivo, DispositivoDTO> {

    @Override
    @Mapping(source = "usuario.id", target = "idUsuario")
    @Mapping(source = "area.id", target = "idArea")
    @Mapping(source = "estado.id", target = "idEstado")
    @Mapping(source = "tipoDispositivo.id", target = "idTipoDispositivo")
    @Mapping(source = "modelo.id", target = "idModelo")
    DispositivoDTO entityToDTO(Dispositivo entity);

    @Override
    @Mapping(source = "idUsuario", target = "usuario.id")
    @Mapping(source = "idArea", target = "area.id")
    @Mapping(source = "idEstado", target = "estado.id")
    @Mapping(source = "idTipoDispositivo", target = "tipoDispositivo.id")
    @Mapping(source = "idModelo", target = "modelo.id")
    Dispositivo DTOtoEntity(DispositivoDTO dto);
}
