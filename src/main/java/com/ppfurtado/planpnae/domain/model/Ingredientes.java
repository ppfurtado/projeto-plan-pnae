package com.ppfurtado.planpnae.domain.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "foods", schema = "planpnae")
public class Ingredientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String nome;
    @OneToOne
    @JoinColumn(name = "categoryId")
    private Categoria categoriaId;

    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "technical_data_sheet_foods",
            joinColumns = @JoinColumn(name = "foodId"),
            inverseJoinColumns = @JoinColumn(name = "technicalDataSheetId"))
    private List<FichaTecnica> fichaTecnicas = new ArrayList<>();

    public Ingredientes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Categoria categoriaId) {
        this.categoriaId = categoriaId;
    }

    public List<FichaTecnica> getFichaTecnicas() {
        return fichaTecnicas;
    }

    public void setFichaTecnicas(List<FichaTecnica> fichaTecnicas) {
        this.fichaTecnicas = fichaTecnicas;
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
