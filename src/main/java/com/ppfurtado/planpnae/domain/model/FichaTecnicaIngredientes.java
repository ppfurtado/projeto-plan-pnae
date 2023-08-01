package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "technical_data_sheet_foods", schema = "planpnae")
public class FichaTecnicaIngredientes {

    @EmbeddedId
    private FichaTecnicaIngredientesId id;

    public FichaTecnicaIngredientes() {
    }

    public FichaTecnicaIngredientes(FichaTecnicaIngredientesId id) {
        this.id = id;
    }

    public FichaTecnicaIngredientesId getId() {
        return id;
    }

    public void setId(FichaTecnicaIngredientesId id) {
        this.id = id;
    }
}
