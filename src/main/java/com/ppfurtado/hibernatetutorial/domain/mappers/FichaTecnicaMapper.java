package com.ppfurtado.hibernatetutorial.domain.mappers;

import com.ppfurtado.hibernatetutorial.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.hibernatetutorial.domain.model.FichaTecnica;
import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FichaTecnicaMapper {

    FichaTecnicaMapper INSTANCE = Mappers.getMapper(FichaTecnicaMapper.class);

    @Mapping(target = "ingredienteId", source = "ingredienteId", qualifiedByName = "idToEntity" )
    FichaTecnica toEntity(FichaTecnicaRequest fichaTecnicaRequest);

    @Mapping(target = "ingredienteId", source = "ingredienteId", qualifiedByName = "entityToId" )
    FichaTecnicaRequest toRequest(FichaTecnica fichaTecnica);

    @Named("idToEntity")
    static Ingredientes idToEntity(Long ingredienteId){
        Ingredientes ingrediente = new Ingredientes();
        if (ingredienteId == null) {
            return null;
        }
        ingrediente.setId(ingredienteId);
        return ingrediente;
    }

    @Named("entityToId")
    static Long entityToId(Ingredientes ingrediente){
        if (ingrediente == null){
            return  null;
        }
        return ingrediente.getId();
    }

}
