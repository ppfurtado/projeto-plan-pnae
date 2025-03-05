package com.ppfurtado.planpnae.domain.specification;

import com.ppfurtado.planpnae.domain.model.Nutrientes;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public class IngredientesSpecification {

    private IngredientesSpecification() {
    }

    public static Specification<Nutrientes> buscarPorListIdIngredientes(List<Long> idsIngrediente){
        return (root, query, cb) -> idsIngrediente.isEmpty() ? cb.conjunction() : root.get("ingredientes").get("id").in(idsIngrediente);
    }
}
