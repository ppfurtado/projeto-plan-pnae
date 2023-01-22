package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "ficha_tecnica")
public class FichaTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ingrediente_id", referencedColumnName = "id")
    private Ingredientes ingredienteId;
    private String perCapitaLiquido;
    private String fatorDeCorrecao;
    private String medidaCaseira;
    private String custoUnitario;
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

    public FichaTecnica() {
    }

    public FichaTecnica(Ingredientes ingredienteId, String perCapitaLiquido, String fatorDeCorrecao, String medidaCaseira, String custoUnitArio, String energiaKcal, String energiaKj, String proteina, String lipideos, String colesterol, String carboidrato, String fibraAlimentar, String cinzas, String calcio, String magnesio, String manganes, String fosforo, String ferro, String sodio, String potassio, String cobre, String zinco, String retinol, String re, String rae, String tiamina, String riboflavina, String piridoxina, String niacina, String vitaminac, String criado, String ultimaAtualizacao) {
        this.ingredienteId = ingredienteId;
        this.perCapitaLiquido = perCapitaLiquido;
        this.fatorDeCorrecao = fatorDeCorrecao;
        this.medidaCaseira = medidaCaseira;
        this.custoUnitario = custoUnitArio;
        this.energiaKcal = energiaKcal;
        this.energiaKj = energiaKj;
        this.proteina = proteina;
        this.lipideos = lipideos;
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
        this.vitaminac = vitaminac;
        this.criado = criado;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredientes getIngredienteId() {
        return ingredienteId;
    }

    public void setIngredienteId(Ingredientes ingredienteId) {
        this.ingredienteId = ingredienteId;
    }

    public String getPerCapitaLiquido() {
        return perCapitaLiquido;
    }

    public void setPerCapitaLiquido(String perCapitaLiquido) {
        this.perCapitaLiquido = perCapitaLiquido;
    }

    public String getFatorDeCorrecao() {
        return fatorDeCorrecao;
    }

    public void setFatorDeCorrecao(String fatorDeCorrecao) {
        this.fatorDeCorrecao = fatorDeCorrecao;
    }

    public String getMedidaCaseira() {
        return medidaCaseira;
    }

    public void setMedidaCaseira(String medidaCaseira) {
        this.medidaCaseira = medidaCaseira;
    }

    public String getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(String custoUnitario) {
        this.custoUnitario = custoUnitario;
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
        FichaTecnica that = (FichaTecnica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
