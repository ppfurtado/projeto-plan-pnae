package com.ppfurtado.planpnae.domain.services;

import com.ppfurtado.planpnae.domain.dtos.CardapioRequest;
import com.ppfurtado.planpnae.domain.model.Cardapio;

import java.util.List;

public interface CardapioService {

    Cardapio save(CardapioRequest request);

    Cardapio findById(Long id);

    List<Cardapio> findAll();

    void delete(Long id);

    void update(Long id, CardapioRequest request);
}
