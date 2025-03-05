package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "amino_acids")
public class AminoAcidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ingredientes ingredientesID;

    @Column(name = "tryptophan")
    private double triptofano;
    @Column(name = "threonine")
    private double treonina;
    @Column(name = "isoleucine")
    private double isoleucina;
    @Column(name = "leucine")
    private double leucina;
    @Column(name = "lysine")
    private double lisina;
    @Column(name = "methionine")
    private double metionina;
    @Column(name = "cystine")
    private double cistina;
    @Column(name = "phenylalanine")
    private double fenilalanina;
    @Column(name = "tyrosine")
    private double tirosina;
    @Column(name = "valine")
    private double valina;
    @Column(name = "arginine")
    private double arginina;
    @Column(name = "histidine")
    private double histidina;
    @Column(name = "alanine")
    private double alanina;
    @Column(name = "asparticAcid")
    private double acidoaspartico;
    @Column(name = "glutamicAcid")
    private double acidoglutamico;
    @Column(name = "glycine")
    private double glicina;
    @Column(name = "proline")
    private double prolina;
    @Column(name = "serine")
    private double serina;

}
