package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CardapioIngredientesId implements Serializable {

    @Column(name = "menuId")
    private Long cardapioId;

    @Column(name = "foodId")
    private Long ingredienteID;

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
