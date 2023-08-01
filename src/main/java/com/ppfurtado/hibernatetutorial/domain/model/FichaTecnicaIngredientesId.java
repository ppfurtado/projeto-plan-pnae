package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class FichaTecnicaIngredientesId implements Serializable {

    @Column(name = "technicalDataSheetId")
    private Long fichaTecnicaId;
    @Column(name = "foodId")
    private Long ingredienteId;

    public FichaTecnicaIngredientesId() {
    }

    public FichaTecnicaIngredientesId(Long fichaTecnicaId, Long ingredienteId) {
        this.fichaTecnicaId = fichaTecnicaId;
        this.ingredienteId = ingredienteId;
    }

    public Long getFichaTecnicaId() {
        return fichaTecnicaId;
    }

    public void setFichaTecnicaId(Long fichaTecnicaId) {
        this.fichaTecnicaId = fichaTecnicaId;
    }

    public Long getIngredienteId() {
        return ingredienteId;
    }

    public void setIngredienteId(Long ingredienteId) {
        this.ingredienteId = ingredienteId;
    }
}
