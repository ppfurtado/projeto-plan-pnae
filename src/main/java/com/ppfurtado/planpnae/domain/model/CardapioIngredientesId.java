package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardapioIngredientesId that = (CardapioIngredientesId) o;

        if (!cardapioId.equals(that.cardapioId)) return false;
        return ingredienteID.equals(that.ingredienteID);
    }

    @Override
    public int hashCode() {
        int result = cardapioId.hashCode();
        result = 31 * result + ingredienteID.hashCode();
        return result;
    }
}
