package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "technical_data_sheet_foods", schema = "planpnae")
public class FichaTecnicaIngredientes {

    @EmbeddedId
    private FichaTecnicaIngredientesId id;
}
