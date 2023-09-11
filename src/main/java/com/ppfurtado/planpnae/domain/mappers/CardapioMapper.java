package com.ppfurtado.planpnae.domain.mappers;

import com.ppfurtado.planpnae.domain.dtos.CardapioRequest;
import com.ppfurtado.planpnae.domain.model.Cardapio;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardapioMapper {

    CardapioMapper INSTANCE = Mappers.getMapper(CardapioMapper.class);

    Cardapio toEntity(CardapioRequest request);


}
