package com.ppfurtado.planpnae.domain.specification;

import com.ppfurtado.planpnae.domain.model.Ingredientes;
import com.ppfurtado.planpnae.domain.model.Ingredientes_;
import org.springframework.data.jpa.domain.Specification;

public class SpecificationIngredientes {

    private SpecificationIngredientes() {
    }

    public static Specification<Ingredientes> buscarPorId(Long id){
        return (root, query, cb) -> id == null ? cb.conjunction() :
            cb.equal(root.get(Ingredientes_.id), id);
    }

    public static Specification<Ingredientes> buscarPorNome(String nome){
        return (root, query, cb) -> nome == null || nome.isEmpty() ?
                cb.conjunction() :
                cb.like(root.get(Ingredientes_.NOME), "%"+nome+"%");
    }
}
