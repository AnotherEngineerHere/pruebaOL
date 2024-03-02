package com.ol.co.mapper;

import com.ol.co.dto.FabricanteDTO;
import com.ol.co.model.Fabricante;
import org.mapstruct.Mapper;

@Mapper
public interface FabricanteMapper extends GenericMapper<Fabricante, FabricanteDTO> {
}
