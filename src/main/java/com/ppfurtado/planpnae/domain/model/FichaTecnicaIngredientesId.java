package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class FichaTecnicaIngredientesId implements Serializable {

    @Column(name = "technicalDataSheetId")
    private Long fichaTecnicaId;
    @Column(name = "foodId")
    private Long ingredienteId;
}
