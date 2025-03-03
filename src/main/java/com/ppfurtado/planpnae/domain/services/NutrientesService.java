package com.ppfurtado.planpnae.domain.services;

import com.ppfurtado.planpnae.domain.model.Nutrientes;

import java.util.List;

public interface NutrientesService {
    public List<Nutrientes> findAllNutrientes(List<Long> idsNutrientes);
}
