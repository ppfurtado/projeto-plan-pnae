package com.ppfurtado.hibernatetutorial.domain.services.servicesImpls;


import com.ppfurtado.hibernatetutorial.domain.model.Ingredientes;
import com.ppfurtado.hibernatetutorial.domain.repositories.IngredientesRepository;
import com.ppfurtado.hibernatetutorial.domain.services.IngredientesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientesServiceImpl implements IngredientesService {

    private final IngredientesRepository ingredientesRepository;

    public IngredientesServiceImpl(IngredientesRepository ingredientesRepository) {
        this.ingredientesRepository = ingredientesRepository;
    }

    @Override
    public List<Ingredientes> buscarIngrediente() {
        return ingredientesRepository.findAll();
    }

    @Override
    public Ingredientes buscarIngredientesPorId(Long id) throws Exception {
        return ingredientesRepository.findById(id).orElseThrow(() -> new Exception("Ingrediente não encontrado"));
    }
}
