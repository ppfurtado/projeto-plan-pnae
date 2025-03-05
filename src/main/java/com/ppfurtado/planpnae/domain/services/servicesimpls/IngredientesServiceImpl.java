package com.ppfurtado.planpnae.domain.services.servicesimpls;


import com.ppfurtado.planpnae.domain.model.Ingredientes;
import com.ppfurtado.planpnae.domain.repositories.IngredientesRepository;
import com.ppfurtado.planpnae.domain.services.IngredientesService;
import com.ppfurtado.planpnae.exception.IngredienteNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ppfurtado.planpnae.domain.specification.SpecificationIngredientes.buscarPorNome;

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
        return ingredientesRepository.findById(id).orElseThrow(() -> new IngredienteNotFoundException(id));
    }

    @Override
    public List<Ingredientes> buscarIngredientesPorNome(String nome) {
        return ingredientesRepository.findAll(buscarPorNome(nome));
    }

}
