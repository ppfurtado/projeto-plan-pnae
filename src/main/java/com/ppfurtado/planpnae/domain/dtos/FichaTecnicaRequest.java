package com.ppfurtado.planpnae.domain.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FichaTecnicaRequest {

    private String nome;
    private List<Long>   ingredientes;
    private List<Double> perCapitaBruto;
    private List<Double> perCapitaLiquido;
    private List<String> medidaCaseira;
    private List<Double> custoUnitario;
    private String modoPreparo;
}
