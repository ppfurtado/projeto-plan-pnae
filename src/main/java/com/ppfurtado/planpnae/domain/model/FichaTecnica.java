package com.ppfurtado.planpnae.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.*;

import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

@Entity
@Table(name = "technical_data_sheet", schema = "planpnae")
public class FichaTecnica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "technical_data_sheet_foods",
            joinColumns = @JoinColumn(name = "technicalDataSheetId"),
            inverseJoinColumns = @JoinColumn(name = "foodId")
    )
    private List<Ingredientes> ingredientes;

    @Column(name = "grossPerCapita")
    private String perCapitaBruto;

    @Column(name = "netPerCapita")
    private String perCapitaLiquido;

    @Column(name = "correctionFactor")
    private String fatorDeCorrecao;

    @Column(name = "cookingFactor")
    private String fatorDeCoccao;

    @Column(name = "householdMeasure")
    private String medidaCaseira;

    @Column(name = "unitCost")
    private String custoUnitario;

    @Column(name = "preparationMethod")
    private String modoPreparo;

    @Column(name = "created")
    private String criado;

    @Column(name = "last_updated")
    private String ultimaAtualizacao;


    private transient List<Double> perCapitaBrutoToString;

    private transient List<Double> perCapitaLiquidoToString;

    private transient List<Double> fatorDeCorrecaoToString;

    private transient List<String> medidaCaseiraToString;

    private transient List<Double> custoUnitarioToString;


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
    public List<Double> getPerCapitaBrutoToString() {
        return perCapitaBrutoToString;
    }

    public String getPerCapitaBruto() {
        return perCapitaBruto;
    }

    public void setPerCapitaBrutoToString(List<Double> perCapitaBrutoToString) throws JsonProcessingException {
        this.perCapitaBrutoToString = perCapitaBrutoToString;
        this.perCapitaBruto = new ObjectMapper().writeValueAsString(perCapitaBrutoToString);
    }

    @JsonIgnore
    public List<Double> getPerCapitaLiquidoToString() {
        return perCapitaLiquidoToString;
    }

    public String getPerCapitaLiquido() {
        return perCapitaLiquido;
    }

    public void setPerCapitaLiquidoToString(List<Double> perCapitaLiquidoToString) throws JsonProcessingException {
        this.perCapitaLiquidoToString = perCapitaLiquidoToString;
        this.perCapitaLiquido = new ObjectMapper().writeValueAsString(perCapitaLiquidoToString);
    }

    @JsonIgnore
    public List<Double> getFatorDeCorrecaoToString() {
        return fatorDeCorrecaoToString;
    }

    public String getFatorDeCorrecao() {
        return fatorDeCorrecao;
    }

    public void setFatorDeCorrecaoToString(List<Double> perCapitabruto, List<Double> perCapitaLiquido) throws JsonProcessingException {

        List<Double> resultado = IntStream.range(0, perCapitabruto.size())
                .mapToDouble(i -> perCapitabruto.get(i) / perCapitaLiquido.get(i))
                .boxed().toList();

        this.fatorDeCorrecaoToString = fatorDeCorrecaoToString;
        this.fatorDeCorrecao = new ObjectMapper().writeValueAsString(resultado);
    }

    public String getFatorDeCoccao() {
        return fatorDeCoccao;
    }

    public void setFatorDeCoccao(List<Double> perCapitaLiquido) throws JsonProcessingException {
        Double resultado = perCapitaLiquido.stream().reduce(0.0,Double::sum);
        this.fatorDeCoccao = new ObjectMapper().writeValueAsString(100.0/resultado);
    }

    @JsonIgnore
    public List<String> getMedidaCaseiraToString() {
        return medidaCaseiraToString;
    }

    public String getMedidaCaseira() {
        return medidaCaseira;
    }

    public void setMedidaCaseiraToString(List<String> medidaCaseiraToString) throws JsonProcessingException {
        this.medidaCaseiraToString = medidaCaseiraToString;
        this.medidaCaseira = new ObjectMapper().writeValueAsString(medidaCaseiraToString);
    }

    @JsonIgnore
    public List<Double> getCustoUnitarioToString() {
        return custoUnitarioToString;
    }

    public String getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitarioToString(List<Double> custoUnitarioToString) throws JsonProcessingException {
        this.custoUnitarioToString = custoUnitarioToString;
        this.custoUnitario = new ObjectMapper().writeValueAsString(custoUnitarioToString);
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
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
