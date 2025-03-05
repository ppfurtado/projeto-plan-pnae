package com.ppfurtado.planpnae.domain.dtos;

import com.ppfurtado.planpnae.domain.model.Categoria;
import com.ppfurtado.planpnae.domain.model.Ingredientes;

public record IngredientesResponse(Long id, String nome, Categoria categoriaId) {

    public IngredientesResponse(Ingredientes ingredientes){
        this(ingredientes.getId(), ingredientes.getNome(), ingredientes.getCategoriaId());
    }
}
