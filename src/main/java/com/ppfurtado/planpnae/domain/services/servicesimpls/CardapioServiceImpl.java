package com.ppfurtado.planpnae.domain.services.servicesimpls;

import com.ppfurtado.planpnae.domain.dtos.CardapioRequest;
import com.ppfurtado.planpnae.domain.mappers.CardapioMapper;
import com.ppfurtado.planpnae.domain.model.Cardapio;
import com.ppfurtado.planpnae.domain.repositories.CardapioRepository;
import com.ppfurtado.planpnae.domain.services.CardapioService;
import com.ppfurtado.planpnae.exception.CardapioNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardapioServiceImpl implements CardapioService {

    private final CardapioRepository cardapioRepository;

    public CardapioServiceImpl(CardapioRepository cardapioRepository) {
        this.cardapioRepository = cardapioRepository;
    }

    @Override
    public Cardapio save(CardapioRequest request) {
        Cardapio cardapio = CardapioMapper.INSTANCE.toEntity(request);
        return cardapioRepository.save(cardapio);
    }

    @Override
    public Cardapio findById(Long id) {
        return cardapioRepository.findById(id).orElseThrow(()-> new CardapioNotFoundException(id));
    }

    @Override
    public List<Cardapio> findAll() {
        return cardapioRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Cardapio cardapio = findById(id);
        cardapioRepository.delete(cardapio);
    }

    @Override
    public void update(Long id, CardapioRequest request) {
        Cardapio cardapioOld = findById(id);
        Cardapio cardapioNew = CardapioMapper.INSTANCE.toEntity(request);
        BeanUtils.copyProperties(cardapioNew, cardapioOld, "id");

        cardapioRepository.save(cardapioNew);
    }

}
