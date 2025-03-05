package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "menu_foods", schema = "planpnae")
public class CardapioIngredientes {

    @EmbeddedId
    private CardapioIngredientesId cardapioIngredientesId;

}
