package com.ppfurtado.planpnae.domain.mappers;

import com.ppfurtado.planpnae.domain.dtos.FichaTecnicaRequest;
import com.ppfurtado.planpnae.domain.model.FichaTecnica;
import com.ppfurtado.planpnae.domain.model.Ingredientes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface FichaTecnicaMapper {

    FichaTecnicaMapper INSTANCE = Mappers.getMapper(FichaTecnicaMapper.class);

    @Mapping(target = "ingredientes", source = "ingredientes", qualifiedByName = "idToEntity" )
    FichaTecnica toEntity(FichaTecnicaRequest fichaTecnicaRequest);

    @Mapping(target = "ingredientes", source = "ingredientes", qualifiedByName = "entityToId" )
    @Mapping(target = "perCapitaBruto", source = "perCapitaBruto", qualifiedByName = "perCapitaBrutoStringToDouble")
    @Mapping(target = "perCapitaLiquido", source = "perCapitaLiquido", qualifiedByName = "perCapitaLiquidoStringToDouble")
    @Mapping(target = "medidaCaseira", source = "medidaCaseira", qualifiedByName = "medidaCaseiraStringToDouble")
    @Mapping(target = "custoUnitario", source = "custoUnitario", qualifiedByName = "custoUnitarioStringToDouble")
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

    @Named("perCapitaBrutoStringToDouble")
    static List<Double> perCapitaBrutoStringToDouble(String perCapitaBruto){
        if (perCapitaBruto == null){
            return null;
        }
        List<Double> result = new ArrayList<>();
        for (String number : perCapitaBruto.split(" ")) {
            result.add(Double.parseDouble(number));
        }
        return result;
    }

    @Named("perCapitaLiquidoStringToDouble")
    static List<Double> perCapitaLiquidoStringToDouble(String perCapitaLiquido){
        if (perCapitaLiquido == null){
            return null;
        }
        List<Double> result = new ArrayList<>();
        for (String number : perCapitaLiquido.split(" ")) {
            result.add(Double.parseDouble(number));
        }
        return result;
    }

    @Named("medidaCaseiraStringToDouble")
    static List<String> medidaCaseiraStringToDouble(String medidaCaseira){
        if (medidaCaseira == null){
            return null;
        }
        List<String> result = new ArrayList<>();
        for (String number : medidaCaseira.split(" ")) {
            result.add(number);
        }
        return result;
    }

    @Named("custoUnitarioStringToDouble")
    static List<Double> custoUnitarioStringToDouble(String custoUnitario){
        if (custoUnitario == null){
            return null;
        }
        List<Double> result = new ArrayList<>();
        for (String number : custoUnitario.split(" ")) {
            result.add(Double.parseDouble(number));
        }
        return result;
    }


}
