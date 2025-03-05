package com.ppfurtado.planpnae.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.IntStream;

@Getter
@Setter
@Embeddable
public class ComposicaoAlimento {

    @Column(name = "moisture")
    private Double umidade = 0.0;

    @Column(name = "kcal")
    private Double energiaKcal = 0.0;

    @Column(name = "kJ")
    private Double energiaKj = 0.0;

    @Column(name = "protein")
    private Double proteina = 0.0;

    @Column(name = "lipids")
    private Double lipideos = 0.0;

    @Column(name = "cholesterol")
    private Double colesterol = 0.0;

    @Column(name = "carbohydrates")
    private Double carboidrato = 0.0;

    @Column(name = "dietaryFiber")
    private Double fibraAlimentar = 0.0;

    @Column(name = "ash")
    private Double cinzas = 0.0;

    @Column(name = "calcium")
    private Double calcio = 0.0;

    @Column(name = "magnesium")
    private Double magnesio = 0.0;

    @Column(name = "manganese")
    private Double manganes = 0.0;

    @Column(name = "phosphorus")
    private Double fosforo = 0.0;

    @Column(name = "iron")
    private Double ferro = 0.0;

    @Column(name = "sodium")
    private Double sodio = 0.0;

    @Column(name = "potassium")
    private Double potassio = 0.0;

    @Column(name = "copper")
    private Double cobre = 0.0;

    @Column(name = "zinc")
    private Double zinco = 0.0;

    @Column(name = "retinol")
    private Double retinol = 0.0;

    @Column(name = "re")
    private Double re = 0.0;

    @Column(name = "rae")
    private Double rae = 0.0;

    @Column(name = "thiamin")
    private Double tiamina = 0.0;

    @Column(name = "riboflavin")
    private Double riboflavina = 0.0;

    @Column(name = "pyridoxine")
    private Double piridoxina = 0.0;

    @Column(name = "niacin")
    private Double niacina = 0.0;

    @Column(name = "vitaminC")
    private Double vitaminaC = 0.0;

    public ComposicaoAlimento() {
    }

    public ComposicaoAlimento(ComposicaoAlimento original) {
        this.umidade = original.umidade;
        this.energiaKcal = original.energiaKcal;
        this.energiaKj = original.energiaKj;
        this.proteina = original.proteina;
        this.lipideos = original.lipideos;
        this.colesterol = original.colesterol;
        this.carboidrato = original.carboidrato;
        this.fibraAlimentar = original.fibraAlimentar;
        this.cinzas = original.cinzas;
        this.calcio = original.calcio;
        this.magnesio = original.magnesio;
        this.manganes = original.manganes;
        this.fosforo = original.fosforo;
        this.ferro = original.ferro;
        this.sodio = original.sodio;
        this.potassio = original.potassio;
        this.cobre = original.cobre;
        this.zinco = original.zinco;
        this.retinol = original.retinol;
        this.re = original.re;
        this.rae = original.rae;
        this.tiamina = original.tiamina;
        this.riboflavina = original.riboflavina;
        this.piridoxina = original.piridoxina;
        this.niacina = original.niacina;
        this.vitaminaC = original.vitaminaC;
    }

    public ComposicaoAlimento acumular(ComposicaoAlimento outro) {
        if (outro == null) {
            return null;
        }
        acumularMacronutrientes(outro);
        acumularMinerais(outro);
        acumularVitaminas(outro);

        return this;
    }

    private static Double somar(Double valor1, Double valor2) {
        return (valor1 != null ? valor1 : 0.0) + (valor2 != null ? valor2 : 0.0);
    }

    private void acumularMacronutrientes(ComposicaoAlimento composicaoAlimento) {
        this.umidade = somar(this.umidade, composicaoAlimento.getUmidade());
        this.energiaKcal = somar(this.energiaKcal, composicaoAlimento.getEnergiaKcal());
        this.energiaKj = somar(this.energiaKj, composicaoAlimento.getEnergiaKj());
        this.proteina = somar(this.proteina, composicaoAlimento.getProteina());
        this.lipideos = somar(this.lipideos, composicaoAlimento.getLipideos());
        this.carboidrato = somar(this.carboidrato, composicaoAlimento.getCarboidrato());
        this.fibraAlimentar = somar(this.fibraAlimentar, composicaoAlimento.getFibraAlimentar());
    }

    private void acumularMinerais(ComposicaoAlimento composicaoAlimento) {
        this.calcio = somar(this.calcio, composicaoAlimento.getCalcio());
        this.magnesio = somar(this.magnesio, composicaoAlimento.getMagnesio());
        this.manganes = somar(this.manganes, composicaoAlimento.getManganes());
        this.fosforo = somar(this.fosforo, composicaoAlimento.getFosforo());
        this.ferro = somar(this.ferro, composicaoAlimento.getFerro());
        this.sodio = somar(this.sodio, composicaoAlimento.getSodio());
        this.potassio = somar(this.potassio, composicaoAlimento.getPotassio());
        this.cobre = somar(this.cobre, composicaoAlimento.getCobre());
        this.zinco = somar(this.zinco, composicaoAlimento.getZinco());
    }

    private void acumularVitaminas(ComposicaoAlimento composicaoAlimento) {
        this.retinol = somar(this.retinol, composicaoAlimento.getRetinol());
        this.re = somar(this.re, composicaoAlimento.getRe());
        this.rae = somar(this.rae, composicaoAlimento.getRae());
        this.tiamina = somar(this.tiamina, composicaoAlimento.getTiamina());
        this.riboflavina = somar(this.riboflavina, composicaoAlimento.getRiboflavina());
        this.piridoxina = somar(this.piridoxina, composicaoAlimento.getPiridoxina());
        this.niacina = somar(this.niacina, composicaoAlimento.getNiacina());
        this.vitaminaC = somar(this.vitaminaC, composicaoAlimento.getVitaminaC());
    }

    public ComposicaoAlimento soma(List<Nutrientes> nutrientesList, List<Double> perCapitaLiquido) {
        List<ComposicaoAlimento> composicaoAlimentos = IntStream.range(0, nutrientesList.size())
                .mapToObj(i -> multiplicarPorPerCapitaLiquida(nutrientesList.get(i).getComposicaoAlimento(), perCapitaLiquido.get(i)))
                .toList();

        return composicaoAlimentos.stream()
                .reduce(new ComposicaoAlimento(), (acumulador, nutriente) -> acumular(nutriente));
    }

    private ComposicaoAlimento multiplicarPorPerCapitaLiquida(ComposicaoAlimento composicaoAlimento, Double valor) {
        if (composicaoAlimento == null || valor == null) {
            return composicaoAlimento;
        }

        aplicarOperacao(composicaoAlimento, (campo, valorAtual) -> {
            try {
                if (campo.getType() == Double.class) {
                    Double valorMultiplicado = (valorAtual != null ? valorAtual : 0.0) * valor / 100;
                    campo.set(composicaoAlimento, valorMultiplicado);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        return composicaoAlimento;
    }

    private void aplicarOperacao(ComposicaoAlimento composicaoAlimento, OperacaoCampo operacao) {
        Field[] campos = ComposicaoAlimento.class.getDeclaredFields();

        for (Field campo : campos) {
            campo.setAccessible(true);
            try {
                Double valorAtual = (Double) campo.get(composicaoAlimento);
                operacao.aplicar(campo, valorAtual);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    @FunctionalInterface
    private interface OperacaoCampo {
        void aplicar(Field campo, Double valorAtual);
    }

}
