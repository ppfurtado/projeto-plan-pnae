package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "menu_foods", schema = "planpnae")
public class CardapioIngredientes {

    @EmbeddedId
    private CardapioIngredientesId cardapioIngredientesId;

    public CardapioIngredientes() {
    }

    public CardapioIngredientes(CardapioIngredientesId cardapioIngredientesId) {
        this.cardapioIngredientesId = cardapioIngredientesId;
    }

    public CardapioIngredientesId getCardapioIngredientesId() {
        return cardapioIngredientesId;
    }

    public void setCardapioIngredientesId(CardapioIngredientesId cardapioIngredientesId) {
        this.cardapioIngredientesId = cardapioIngredientesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CardapioIngredientes that = (CardapioIngredientes) o;

        return Objects.equals(cardapioIngredientesId, that.cardapioIngredientesId);
    }

    @Override
    public int hashCode() {
        return cardapioIngredientesId != null ? cardapioIngredientesId.hashCode() : 0;
    }
}
