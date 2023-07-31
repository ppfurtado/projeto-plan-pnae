package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fatty_acids", schema = "planpnae")
public class AcidosGraxos {

    @Id
    @JoinColumn(name = "foodId")
    @OneToOne
    private Ingredientes ingredientes;
    @Column(name = "saturated")
    private double Saturados;
    @Column(name = "monounsaturated")
    private double Monoinsaturados;
    @Column(name = "polyunsaturated")
    private double Poliinsaturados;
    @Column(name = "12:0")
    private double dozeZero;
    @Column(name = "14:0")
    private double quatorzeZero;
    @Column(name = "14:1")
    private double quatorzeUm;
    @Column(name = "16:0")
    private double dezesseisZero;
    @Column(name = "16:1")
    private double dezesseisUm;
    @Column(name = "18:0")
    private double dezoitoZero;
    @Column(name = "18:1")
    private double dezoitoUm;
    @Column(name = "18:1t")
    private double dezoitoUmT;
    @Column(name = "18:2n6")
    private double dezoitoDoisN6;
    @Column(name = "18:2t")
    private double dezoitoDoisT;
    @Column(name = "18:3n3")
    private double dezoitoTrêsN3;
    @Column(name = "20:0")
    private double vinteZero;
    @Column(name = "20:1")
    private double vinteUm;
    @Column(name = "20:4")
    private double vinteQuatro;
    @Column(name = "20:5")
    private double vinteCinco;
    @Column(name = "22:0")
    private double vinteDoisZero;
    @Column(name = "22:5")
    private double vinteDoisCinco;
    @Column(name = "22:6")
    private double vinteDoisSeis;
    @Column(name = "24:0")
    private double vinteQuatroZero;

}
