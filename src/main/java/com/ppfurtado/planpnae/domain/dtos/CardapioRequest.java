package com.ppfurtado.planpnae.domain.dtos;

import com.ppfurtado.planpnae.domain.model.Ingredientes;

import java.util.List;
import java.util.Map;

public class CardapioRequest {

    private Map<String, String> refeicaooHorario;
    private List<Ingredientes> ingredientes;
    private double quantidade;

    public CardapioRequest() {
    }

    public CardapioRequest(Map<String, String> refeicaooHorario, List<Ingredientes> ingredientes, double quantidade) {
        this.refeicaooHorario = refeicaooHorario;
        this.ingredientes = ingredientes;
        this.quantidade = quantidade;
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
}
