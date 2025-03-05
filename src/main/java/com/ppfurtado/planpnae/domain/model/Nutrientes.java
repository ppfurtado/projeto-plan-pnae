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

    @Embedded
    private ComposicaoAlimento composicaoAlimento;

    public Nutrientes() {
    }

    public Nutrientes(Nutrientes original) {
        this.id = original.id;
        this.ingredientes = original.ingredientes;
        this.composicaoAlimento = new ComposicaoAlimento(original.composicaoAlimento);
    }

    public Nutrientes(Long id, Ingredientes ingredientes, ComposicaoAlimento composicaoAlimento) {
        this.id = id;
        this.ingredientes = ingredientes;
        this.composicaoAlimento = composicaoAlimento;
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