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
    private double lipideos;
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

    public Nutrientes() {
    }

    public Nutrientes(Long id, Ingredientes ingredientes, double umidade, double energiaKcal, double energiaKj, double proteina, double lipídeos, double colesterol, double carboidrato, double fibraAlimentar, double cinzas, double calcio, double magnesio, double manganes, double fosforo, double ferro, double sodio, double potassio, double cobre, double zinco, double retinol, double re, double rae, double tiamina, double riboflavina, double piridoxina, double niacina, double vitaminaC) {
        this.id = id;
        this.ingredientes = ingredientes;
        this.umidade = umidade;
        this.energiaKcal = energiaKcal;
        this.energiaKj = energiaKj;
        this.proteina = proteina;
        this.lipideos = lipídeos;
        this.colesterol = colesterol;
        this.carboidrato = carboidrato;
        this.fibraAlimentar = fibraAlimentar;
        this.cinzas = cinzas;
        this.calcio = calcio;
        this.magnesio = magnesio;
        this.manganes = manganes;
        this.fosforo = fosforo;
        this.ferro = ferro;
        this.sodio = sodio;
        this.potassio = potassio;
        this.cobre = cobre;
        this.zinco = zinco;
        this.retinol = retinol;
        this.re = re;
        this.rae = rae;
        this.tiamina = tiamina;
        this.riboflavina = riboflavina;
        this.piridoxina = piridoxina;
        this.niacina = niacina;
        this.vitaminaC = vitaminaC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getEnergiaKcal() {
        return energiaKcal;
    }

    public void setEnergiaKcal(double energiaKcal) {
        this.energiaKcal = energiaKcal;
    }

    public double getEnergiaKj() {
        return energiaKj;
    }

    public void setEnergiaKj(double energiaKj) {
        this.energiaKj = energiaKj;
    }

    public double getProteina() {
        return proteina;
    }

    public void setProteina(double proteina) {
        this.proteina = proteina;
    }

    public double getLipideos() {
        return lipideos;
    }

    public void setLipideos(double lipideos) {
        this.lipideos = lipideos;
    }

    public double getColesterol() {
        return colesterol;
    }

    public void setColesterol(double colesterol) {
        this.colesterol = colesterol;
    }

    public double getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(double carboidrato) {
        this.carboidrato = carboidrato;
    }

    public double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public double getCinzas() {
        return cinzas;
    }

    public void setCinzas(double cinzas) {
        this.cinzas = cinzas;
    }

    public double getCalcio() {
        return calcio;
    }

    public void setCalcio(double calcio) {
        this.calcio = calcio;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public double getManganes() {
        return manganes;
    }

    public void setManganes(double manganes) {
        this.manganes = manganes;
    }

    public double getFosforo() {
        return fosforo;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getFerro() {
        return ferro;
    }

    public void setFerro(double ferro) {
        this.ferro = ferro;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public double getPotassio() {
        return potassio;
    }

    public void setPotassio(double potassio) {
        this.potassio = potassio;
    }

    public double getCobre() {
        return cobre;
    }

    public void setCobre(double cobre) {
        this.cobre = cobre;
    }

    public double getZinco() {
        return zinco;
    }

    public void setZinco(double zinco) {
        this.zinco = zinco;
    }

    public double getRetinol() {
        return retinol;
    }

    public void setRetinol(double retinol) {
        this.retinol = retinol;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getRae() {
        return rae;
    }

    public void setRae(double rae) {
        this.rae = rae;
    }

    public double getTiamina() {
        return tiamina;
    }

    public void setTiamina(double tiamina) {
        this.tiamina = tiamina;
    }

    public double getRiboflavina() {
        return riboflavina;
    }

    public void setRiboflavina(double riboflavina) {
        this.riboflavina = riboflavina;
    }

    public double getPiridoxina() {
        return piridoxina;
    }

    public void setPiridoxina(double piridoxina) {
        this.piridoxina = piridoxina;
    }

    public double getNiacina() {
        return niacina;
    }

    public void setNiacina(double niacina) {
        this.niacina = niacina;
    }

    public double getVitaminaC() {
        return vitaminaC;
    }

    public void setVitaminaC(double vitaminaC) {
        this.vitaminaC = vitaminaC;
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
