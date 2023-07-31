package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nutrients", schema = "planpnae")
public class Nutrientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ingredientes ingredientes;
    @Column(name = "moisture")
    private double umidade;
    @Column(name = "kcal")
    private double energiaKcal;
    @Column(name = "kJ")
    private double energiaKj;
    @Column(name = "protein")
    private double proteina;
    @Column(name = "lipids")
    private double lipídeos;
    @Column(name = "cholesterol")
    private double colesterol;
    @Column(name = "carbohydrates")
    private double carboidrato;
    @Column(name = "dietaryFiber")
    private double fibraAlimentar;
    @Column(name = "ash")
    private double cinzas;
    @Column(name = "calcium")
    private double calcio;
    @Column(name = "magnesium")
    private double magnesio;
    @Column(name = "manganese")
    private double manganes;
    @Column(name = "phosphorus")
    private double fosforo;
    @Column(name = "iron")
    private double ferro;
    @Column(name = "sodium")
    private double sodio;
    @Column(name = "potassium")
    private double potassio;
    @Column(name = "copper")
    private double cobre;
    @Column(name = "zinc")
    private double zinco;
    @Column(name = "retinol")
    private double retinol;
    @Column(name = "re")
    private double re;
    @Column(name = "rae")
    private double rae;
    @Column(name = "thiamin")
    private double tiamina;
    @Column(name = "riboflavin")
    private double riboflavina;
    @Column(name = "pyridoxine")
    private double piridoxina;
    @Column(name = "niacin")
    private double niacina;
    @Column(name = "vitaminC")
    private double vitaminaC;

}
