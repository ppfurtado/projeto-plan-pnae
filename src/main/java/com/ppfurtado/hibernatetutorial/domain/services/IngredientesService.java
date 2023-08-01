package com.ppfurtado.hibernatetutorial.domain.services;

import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;

import java.util.List;

public interface IngredientesService {

    List<Ingredientes> buscarIngrediente();

    Ingredientes buscarIngredientesPorId(Long id) throws Exception;

    List<Ingredientes> buscarIngredientesPorNome(String nome);

}
