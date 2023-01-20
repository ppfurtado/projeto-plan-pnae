package com.ppfurtado.hibernatetutorial.domain.mappers;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FichaTecnicaMapper {

    FichaTecnicaMapper INSTANCE = Mappers.getMapper(FichaTecnicaMapper.class);

    FichaTecnica toEntity(FichaTecnicaRequest fichaTecnicaRequest);

    FichaTecnicaRequest toRequest(FichaTecnica fichaTecnica);

}
