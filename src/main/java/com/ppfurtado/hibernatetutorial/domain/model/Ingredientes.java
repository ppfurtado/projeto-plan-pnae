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
    private ComposicaoAlimento composicaoAlimento;
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

    public ComposicaoAlimento getComposicaoAlimento() {
        return composicaoAlimento;
    }

    public void setComposicaoAlimento(ComposicaoAlimento composicaoAlimento) {
        this.composicaoAlimento = composicaoAlimento;
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
