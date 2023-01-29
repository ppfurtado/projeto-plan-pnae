package com.ppfurtado.hibernatetutorial.domain.model;


import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ingredientes")
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoria;
    private String numeroAlimento;
    private String descricaoAlimento;
    private String umidade;
    private String energiaKcal;
    private String energiaKj;
    private String proteina;
    private String lipideos;
    private String colesterol;
    private String carboidrato;
    private String fibraAlimentar;
    private String cinzas;
    private String calcio;
    private String magnesio;
    private String manganes;
    private String fosforo;
    private String ferro;
    private String sodio;
    private String potassio;
    private String cobre;
    private String zinco;
    private String retinol;
    private String re;
    private String rae;
    private String tiamina;
    private String riboflavina;
    private String piridoxina;
    private String niacina;
    private String vitaminac;
    private String criado;
    private String ultimaAtualizacao;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH})
    @JoinTable(
            name = "fichas_ingredientes",
            joinColumns = @JoinColumn(name = "ingredientes_id"),
            inverseJoinColumns = @JoinColumn(name = "ficha_tecnica_id")
    )
    private List<FichaTecnica> fichaTecnicas;

    public Ingredientes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumeroAlimento() {
        return numeroAlimento;
    }

    public void setNumeroAlimento(String numeroAlimento) {
        this.numeroAlimento = numeroAlimento;
    }

    public String getDescricaoAlimento() {
        return descricaoAlimento;
    }

    public void setDescricaoAlimento(String descricaoAlimento) {
        this.descricaoAlimento = descricaoAlimento;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getEnergiaKcal() {
        return energiaKcal;
    }

    public void setEnergiaKcal(String energiaKcal) {
        this.energiaKcal = energiaKcal;
    }

    public String getEnergiaKj() {
        return energiaKj;
    }

    public void setEnergiaKj(String energiaKj) {
        this.energiaKj = energiaKj;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getLipideos() {
        return lipideos;
    }

    public void setLipideos(String lipideos) {
        this.lipideos = lipideos;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }

    public String getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(String carboidrato) {
        this.carboidrato = carboidrato;
    }

    public String getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(String fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public String getCinzas() {
        return cinzas;
    }

    public void setCinzas(String cinzas) {
        this.cinzas = cinzas;
    }

    public String getCalcio() {
        return calcio;
    }

    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public String getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(String magnesio) {
        this.magnesio = magnesio;
    }

    public String getManganes() {
        return manganes;
    }

    public void setManganes(String manganes) {
        this.manganes = manganes;
    }

    public String getFosforo() {
        return fosforo;
    }

    public void setFosforo(String fosforo) {
        this.fosforo = fosforo;
    }

    public String getFerro() {
        return ferro;
    }

    public void setFerro(String ferro) {
        this.ferro = ferro;
    }

    public String getSodio() {
        return sodio;
    }

    public void setSodio(String sodio) {
        this.sodio = sodio;
    }

    public String getPotassio() {
        return potassio;
    }

    public void setPotassio(String potassio) {
        this.potassio = potassio;
    }

    public String getCobre() {
        return cobre;
    }

    public void setCobre(String cobre) {
        this.cobre = cobre;
    }

    public String getZinco() {
        return zinco;
    }

    public void setZinco(String zinco) {
        this.zinco = zinco;
    }

    public String getRetinol() {
        return retinol;
    }

    public void setRetinol(String retinol) {
        this.retinol = retinol;
    }

    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    public String getRae() {
        return rae;
    }

    public void setRae(String rae) {
        this.rae = rae;
    }

    public String getTiamina() {
        return tiamina;
    }

    public void setTiamina(String tiamina) {
        this.tiamina = tiamina;
    }

    public String getRiboflavina() {
        return riboflavina;
    }

    public void setRiboflavina(String riboflavina) {
        this.riboflavina = riboflavina;
    }

    public String getPiridoxina() {
        return piridoxina;
    }

    public void setPiridoxina(String piridoxina) {
        this.piridoxina = piridoxina;
    }

    public String getNiacina() {
        return niacina;
    }

    public void setNiacina(String niacina) {
        this.niacina = niacina;
    }

    public String getVitaminac() {
        return vitaminac;
    }

    public void setVitaminac(String vitaminac) {
        this.vitaminac = vitaminac;
    }

    public String getCriado() {
        return criado;
    }

    public void setCriado(String criado) {
        this.criado = criado;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredientes that = (Ingredientes) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
