package com.ppfurtado.planpnae.domain.services.servicesimpls;

import com.ppfurtado.planpnae.domain.model.Nutrientes;
import com.ppfurtado.planpnae.domain.repositories.NutrientesRepository;
import com.ppfurtado.planpnae.domain.services.NutrientesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.ppfurtado.planpnae.domain.specification.IngredientesSpecification.buscarPorListIdIngredientes;

@RequiredArgsConstructor
@Service
public class NutrientesServiceImpl implements NutrientesService {

    private final NutrientesRepository nutrientesRepository;

    @Override
    public List<Nutrientes> findAllNutrientes(List<Long> idsNutrientes) {
        return nutrientesRepository.findAll(buscarPorListIdIngredientes(idsNutrientes));
    }
}
