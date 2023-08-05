package com.ppfurtado.planpnae.domain.dtos;

import java.util.List;

public class FichaTecnicaRequest {

    private List<Long>   ingredientes;
    private List<Double> perCapitaBruto;
    private List<Double> perCapitaLiquido;
    private List<String> medidaCaseira;
    private List<Double> custoUnitario;

    private String modoPreparo;

    public FichaTecnicaRequest() {

    }

    public List<Long> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Long> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Double> getPerCapitaBruto() {
        return perCapitaBruto;
    }

    public void setPerCapitaBruto(List<Double> perCapitaBruto) {
        this.perCapitaBruto = perCapitaBruto;
    }

    public List<Double> getPerCapitaLiquido() {
        return perCapitaLiquido;
    }

    public void setPerCapitaLiquido(List<Double> perCapitaLiquido) {
        this.perCapitaLiquido = perCapitaLiquido;
    }

    public List<String> getMedidaCaseira() {
        return medidaCaseira;
    }

    public void setMedidaCaseira(List<String> medidaCaseira) {
        this.medidaCaseira = medidaCaseira;
    }

    public List<Double> getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(List<Double> custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }
}
