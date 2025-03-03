package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "units", schema = "planpnae")
public class Unidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fieldName")
    private String nomeCampo;
    @Column(name = "unit")
    private String unidade;
    @Column(name = "labelPt")
    private String nomePortugues;
    @Column(name = "infoodsTagname")
    private String nomeInfoods;
    @Column(name = "systematicName")
    private String nomeSistematico;
    @Column(name = "commonName")
    private String nomeComum;

}
