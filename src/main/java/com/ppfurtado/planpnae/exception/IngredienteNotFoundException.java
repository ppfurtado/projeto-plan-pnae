package com.ppfurtado.planpnae.exception;

public class IngredienteNotFoundException extends RuntimeException {

    public IngredienteNotFoundException(Long id) {
        super(String.format("Ingrediente com id %d não encontrado", id));
    }
}
