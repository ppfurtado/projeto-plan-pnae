package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

import java.io.Serializable;

@Embeddable
public class CardapioIngredientesId implements Serializable {

    @Column(name = "menuId")
    private Long cardapioId;

    @Column(name = "foodId")
    private Long ingredienteID;

    public CardapioIngredientesId() {
    }

    public CardapioIngredientesId(Long cardapioId, Long ingredienteID) {
        this.cardapioId = cardapioId;
        this.ingredienteID = ingredienteID;
    }

    public Long getCardapioId() {
        return cardapioId;
    }

    public void setCardapioId(Long cardapioId) {
        this.cardapioId = cardapioId;
    }

    public Long getIngredienteID() {
        return ingredienteID;
    }

    public void setIngredienteID(Long ingredienteID) {
        this.ingredienteID = ingredienteID;
    }
}
