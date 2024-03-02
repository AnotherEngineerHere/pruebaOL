package com.ol.co.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GenericMapper<Entity, DTO> {

    DTO entityToDTO(Entity entity);

    Entity DTOtoEntity(DTO dto);
    
}