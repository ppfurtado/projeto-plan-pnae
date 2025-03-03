package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "nutrients", schema = "planpnae")
public class Nutrientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "foodId")
    private Ingredientes ingredientes;

    @Column(name = "moisture")
    private Double umidade = 0.0;

    @Column(name = "kcal")
    private Double energiaKcal = 0.0;

    @Column(name = "kJ")
    private Double energiaKj = 0.0;

    @Column(name = "protein")
    private Double proteina = 0.0;

    @Column(name = "lipids")
    private Double lipideos = 0.0;

    @Column(name = "cholesterol")
    private Double colesterol = 0.0;

    @Column(name = "carbohydrates")
    private Double carboidrato = 0.0;

    @Column(name = "dietaryFiber")
    private Double fibraAlimentar = 0.0;

    @Column(name = "ash")
    private Double cinzas = 0.0;

    @Column(name = "calcium")
    private Double calcio = 0.0;

    @Column(name = "magnesium")
    private Double magnesio = 0.0;

    @Column(name = "manganese")
    private Double manganes = 0.0;

    @Column(name = "phosphorus")
    private Double fosforo = 0.0;

    @Column(name = "iron")
    private Double ferro = 0.0;

    @Column(name = "sodium")
    private Double sodio = 0.0;

    @Column(name = "potassium")
    private Double potassio = 0.0;

    @Column(name = "copper")
    private Double cobre = 0.0;

    @Column(name = "zinc")
    private Double zinco = 0.0;

    @Column(name = "retinol")
    private Double retinol = 0.0;

    @Column(name = "re")
    private Double re = 0.0;

    @Column(name = "rae")
    private Double rae = 0.0;

    @Column(name = "thiamin")
    private Double tiamina = 0.0;

    @Column(name = "riboflavin")
    private Double riboflavina = 0.0;

    @Column(name = "pyridoxine")
    private Double piridoxina = 0.0;

    @Column(name = "niacin")
    private Double niacina = 0.0;

    @Column(name = "vitaminC")
    private Double vitaminaC = 0.0;

    public Nutrientes() {
        // Construtor padrão inicializa os campos com 0.0
    }

    public Nutrientes(Long id, Ingredientes ingredientes, Double umidade, Double energiaKcal, Double energiaKj, Double proteina, Double lipideos, Double colesterol, Double carboidrato, Double fibraAlimentar, Double cinzas, Double calcio, Double magnesio, Double manganes, Double fosforo, Double ferro, Double sodio, Double potassio, Double cobre, Double zinco, Double retinol, Double re, Double rae, Double tiamina, Double riboflavina, Double piridoxina, Double niacina, Double vitaminaC) {
        this.id = id;
        this.ingredientes = ingredientes;
        this.umidade = umidade != null ? umidade : 0.0;
        this.energiaKcal = energiaKcal != null ? energiaKcal : 0.0;
        this.energiaKj = energiaKj != null ? energiaKj : 0.0;
        this.proteina = proteina != null ? proteina : 0.0;
        this.lipideos = lipideos != null ? lipideos : 0.0;
        this.colesterol = colesterol != null ? colesterol : 0.0;
        this.carboidrato = carboidrato != null ? carboidrato : 0.0;
        this.fibraAlimentar = fibraAlimentar != null ? fibraAlimentar : 0.0;
        this.cinzas = cinzas != null ? cinzas : 0.0;
        this.calcio = calcio != null ? calcio : 0.0;
        this.magnesio = magnesio != null ? magnesio : 0.0;
        this.manganes = manganes != null ? manganes : 0.0;
        this.fosforo = fosforo != null ? fosforo : 0.0;
        this.ferro = ferro != null ? ferro : 0.0;
        this.sodio = sodio != null ? sodio : 0.0;
        this.potassio = potassio != null ? potassio : 0.0;
        this.cobre = cobre != null ? cobre : 0.0;
        this.zinco = zinco != null ? zinco : 0.0;
        this.retinol = retinol != null ? retinol : 0.0;
        this.re = re != null ? re : 0.0;
        this.rae = rae != null ? rae : 0.0;
        this.tiamina = tiamina != null ? tiamina : 0.0;
        this.riboflavina = riboflavina != null ? riboflavina : 0.0;
        this.piridoxina = piridoxina != null ? piridoxina : 0.0;
        this.niacina = niacina != null ? niacina : 0.0;
        this.vitaminaC = vitaminaC != null ? vitaminaC : 0.0;
    }

    public Nutrientes acumular(Nutrientes outro) {
        if (outro == null) {
            return this;
        }

        acumularMacronutrientes(outro);
        acumularMinerais(outro);
        acumularVitaminas(outro);

        return this;
    }

    private Double somar(Double valor1, Double valor2) {
        return (valor1 != null ? valor1 : 0.0) + (valor2 != null ? valor2 : 0.0);
    }

    private void acumularMacronutrientes(Nutrientes outro) {
        this.umidade = somar(this.umidade, outro.umidade);
        this.energiaKcal = somar(this.energiaKcal, outro.energiaKcal);
        this.energiaKj = somar(this.energiaKj, outro.energiaKj);
        this.proteina = somar(this.proteina, outro.proteina);
        this.lipideos = somar(this.lipideos, outro.lipideos);
        this.carboidrato = somar(this.carboidrato, outro.carboidrato);
        this.fibraAlimentar = somar(this.fibraAlimentar, outro.fibraAlimentar);
    }

    private void acumularMinerais(Nutrientes outro) {
        this.calcio = somar(this.calcio, outro.calcio);
        this.magnesio = somar(this.magnesio, outro.magnesio);
        this.manganes = somar(this.manganes, outro.manganes);
        this.fosforo = somar(this.fosforo, outro.fosforo);
        this.ferro = somar(this.ferro, outro.ferro);
        this.sodio = somar(this.sodio, outro.sodio);
        this.potassio = somar(this.potassio, outro.potassio);
        this.cobre = somar(this.cobre, outro.cobre);
        this.zinco = somar(this.zinco, outro.zinco);
    }

    private void acumularVitaminas(Nutrientes outro) {
        this.retinol = somar(this.retinol, outro.retinol);
        this.re = somar(this.re, outro.re);
        this.rae = somar(this.rae, outro.rae);
        this.tiamina = somar(this.tiamina, outro.tiamina);
        this.riboflavina = somar(this.riboflavina, outro.riboflavina);
        this.piridoxina = somar(this.piridoxina, outro.piridoxina);
        this.niacina = somar(this.niacina, outro.niacina);
        this.vitaminaC = somar(this.vitaminaC, outro.vitaminaC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Nutrientes that = (Nutrientes) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}