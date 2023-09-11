package com.ppfurtado.planpnae.exception;

public class CardapioNotFoundException extends RuntimeException {

    public CardapioNotFoundException(Long id) {
        super(String.format("Cardapio com id %d não encontrado", id));
    }
}
