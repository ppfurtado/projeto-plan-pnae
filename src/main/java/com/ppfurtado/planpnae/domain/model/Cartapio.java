package com.ppfurtado.planpnae.domain.model;

import com.ppfurtado.planpnae.domain.mappers.JpaConverterJson;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "menu", schema = "planpnae")
public class Cartapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Convert(converter = JpaConverterJson.class)
    @Column(name = "mealSchedule", columnDefinition = "jsonb")
    private Map<String, String> refeicaooHorario = new HashMap<>();
    @ManyToMany
    @JoinTable(
            name = "menu_foods",
            joinColumns = @JoinColumn(name = "menuId"),
            inverseJoinColumns = @JoinColumn(name = "foodId")
    )
    @Column(name = "foodId")
    private List<Ingredientes> ingredientes;
    @Column(name = "amount")
    private double quantidade;

    @Column(name = "created")
    private Date criada;
    @Column(name = "last_updated")
    private Date ultimaAtualizacao;

    public Cartapio() {
    }

    public Cartapio(Long id, Map<String, String> refeicaooHorario, List<Ingredientes> ingredientes, double quantidade, Date criada, Date ultimaAtualizacao) {
        this.id = id;
        this.refeicaooHorario = refeicaooHorario;
        this.ingredientes = ingredientes;
        this.quantidade = quantidade;
        this.criada = criada;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<String, String> getRefeicaooHorario() {
        return refeicaooHorario;
    }

    public void setRefeicaooHorario(Map<String, String> refeicaooHorario) {
        this.refeicaooHorario = refeicaooHorario;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Date getCriada() {
        return criada;
    }

    public void setCriada(Date criada) {
        this.criada = criada;
    }

    public Date getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cartapio cartapio = (Cartapio) o;

        return id.equals(cartapio.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}