package com.ol.co.mapper;

import com.ol.co.dto.EstadoDTO;
import com.ol.co.model.Estado;
import org.mapstruct.Mapper;

@Mapper
public interface EstadoMapper extends GenericMapper<Estado, EstadoDTO> {
}
