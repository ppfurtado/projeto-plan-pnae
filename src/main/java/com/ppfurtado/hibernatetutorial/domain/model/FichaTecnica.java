package com.ppfurtado.hibernatetutorial.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ficha_tecnica")
public class FichaTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
                CascadeType.REFRESH})
    @JoinTable(
            name = "fichas_ingredientes",
            joinColumns = @JoinColumn(name = "ficha_tecnica_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredientes_id")
    )
    private List<Ingredientes> ingredientes;

    private String perCapitaLiquido;

    private String fatorDeCorrecao;

    private String medidaCaseira;

    private String custoUnitario;

    private transient List<Double> perCapitaLiquidoToString;

    private transient List<Double> fatorDeCorrecaoToString;

    private transient List<Double> medidaCaseiraToString;

    private transient List<Double> custoUnitarioToString;

    private ComposicaoAlimento  composicaoAlimento;

    private String criado;
    private String ultimaAtualizacao;

    public FichaTecnica() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @JsonIgnore
    public List<Double> getPerCapitaLiquidoToString() {
        return perCapitaLiquidoToString;
    }

    public void setPerCapitaLiquidoToString(List<Double> perCapitaLiquidoToString) throws JsonProcessingException {
        this.perCapitaLiquidoToString = perCapitaLiquidoToString;
        this.perCapitaLiquido = new ObjectMapper().writeValueAsString(perCapitaLiquidoToString);
    }

    @JsonIgnore
    public List<Double> getFatorDeCorrecaoToString() {
        return fatorDeCorrecaoToString;
    }

    public void setFatorDeCorrecaoToString(List<Double> fatorDeCorrecaoToString) throws JsonProcessingException {
        this.fatorDeCorrecaoToString = fatorDeCorrecaoToString;
        this.fatorDeCorrecao = new ObjectMapper().writeValueAsString(fatorDeCorrecaoToString);
    }

    @JsonIgnore
    public List<Double> getMedidaCaseiraToString() {
        return medidaCaseiraToString;
    }

    public void setMedidaCaseiraToString(List<Double> medidaCaseiraToString) throws JsonProcessingException {
        this.medidaCaseiraToString = medidaCaseiraToString;
        this.medidaCaseira = new ObjectMapper().writeValueAsString(medidaCaseiraToString);
    }

    @JsonIgnore
    public List<Double> getCustoUnitarioToString() {
        return custoUnitarioToString;
    }

    public void setCustoUnitarioToString(List<Double> custoUnitarioToString) throws JsonProcessingException {
        this.custoUnitarioToString = custoUnitarioToString;
        this.custoUnitario = new ObjectMapper().writeValueAsString(custoUnitarioToString);
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
        FichaTecnica that = (FichaTecnica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @PrePersist
    public void preAgendar() throws UnknownHostException {
        this.setCriado(LocalDateTime.now().toString());
        this.setUltimaAtualizacao(LocalDateTime.now().toString());
    }

    @PreUpdate
    public void atualiza() throws UnknownHostException {
        this.setUltimaAtualizacao(LocalDateTime.now().toString());
    }
}
