package com.ol.co.mapper;

import com.ol.co.dto.ModeloDTO;
import com.ol.co.model.Modelo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ModeloMapper extends GenericMapper<Modelo, ModeloDTO> {
    
    @Override
    @Mapping(source = "fabricante.idFabricante", target = "idFabricante")
    ModeloDTO entityToDTO(Modelo entity);

    @Override
    @Mapping(source = "idFabricante", target = "fabricante.idFabricante")
    Modelo DTOtoEntity(ModeloDTO dto);
}
