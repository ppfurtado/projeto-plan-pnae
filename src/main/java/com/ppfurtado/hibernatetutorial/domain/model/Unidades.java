package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

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

    public Unidades() {
    }

    public Unidades(Long id, String nomeCampo, String unidade, String nomePortugues, String nomeInfoods, String nomeSistematico, String nomeComum) {
        this.id = id;
        this.nomeCampo = nomeCampo;
        this.unidade = unidade;
        this.nomePortugues = nomePortugues;
        this.nomeInfoods = nomeInfoods;
        this.nomeSistematico = nomeSistematico;
        this.nomeComum = nomeComum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }

    public void setNomePortugues(String nomePortugues) {
        this.nomePortugues = nomePortugues;
    }

    public String getNomeInfoods() {
        return nomeInfoods;
    }

    public void setNomeInfoods(String nomeInfoods) {
        this.nomeInfoods = nomeInfoods;
    }

    public String getNomeSistematico() {
        return nomeSistematico;
    }

    public void setNomeSistematico(String nomeSistematico) {
        this.nomeSistematico = nomeSistematico;
    }

    public String getNomeComum() {
        return nomeComum;
    }

    public void setNomeComum(String nomeComum) {
        this.nomeComum = nomeComum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Unidades unidades = (Unidades) o;

        return id.equals(unidades.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
