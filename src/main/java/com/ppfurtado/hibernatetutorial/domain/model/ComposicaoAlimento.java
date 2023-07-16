package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.Embeddable;

import java.util.List;
import java.util.stream.IntStream;

@Embeddable
public class ComposicaoAlimento {

    protected String energiaKcal;
    protected String energiaKj;
    protected String proteina;
    protected String lipideos;
    protected String colesterol;
    protected String carboidrato;
    protected String fibraAlimentar;
    protected String cinzas;
    protected String calcio;
    protected String magnesio;
    protected String manganes;
    protected String fosforo;
    protected String ferro;
    protected String sodio;
    protected String potassio;
    protected String cobre;
    protected String zinco;
    protected String retinol;
    protected String re;
    protected String rae;
    protected String tiamina;
    protected String riboflavina;
    protected String piridoxina;
    protected String niacina;
    protected String vitaminac;

    public ComposicaoAlimento() {
    }

    public ComposicaoAlimento(ComposicaoAlimento composicaoAlimento) {
        this.energiaKcal = composicaoAlimento.energiaKcal;
        this.energiaKj = composicaoAlimento.energiaKj;
        this.proteina = composicaoAlimento.proteina;
        this.lipideos = composicaoAlimento.lipideos;
        this.colesterol = composicaoAlimento.colesterol;
        this.carboidrato = composicaoAlimento.carboidrato;
        this.fibraAlimentar = composicaoAlimento.fibraAlimentar;
        this.cinzas = composicaoAlimento.cinzas;
        this.calcio = composicaoAlimento.calcio;
        this.magnesio = composicaoAlimento.magnesio;
        this.manganes = composicaoAlimento.manganes;
        this.fosforo = composicaoAlimento.fosforo;
        this.ferro = composicaoAlimento.ferro;
        this.sodio = composicaoAlimento.sodio;
        this.potassio = composicaoAlimento.potassio;
        this.cobre = composicaoAlimento.cobre;
        this.zinco = composicaoAlimento.zinco;
        this.retinol = composicaoAlimento.retinol;
        this.re = composicaoAlimento.re;
        this.rae = composicaoAlimento.rae;
        this.tiamina = composicaoAlimento.tiamina;
        this.riboflavina = composicaoAlimento.riboflavina;
        this.piridoxina = composicaoAlimento.piridoxina;
        this.niacina = composicaoAlimento.niacina;
        this.vitaminac = composicaoAlimento.vitaminac;
    }

    public String getEnergiaKcal() {
        return energiaKcal;
    }

    public void setEnergiaKcal(String energiaKcal) {
        this.energiaKcal = energiaKcal;
    }

    public String getEnergiaKj() {
        return energiaKj;
    }

    public void setEnergiaKj(String energiaKj) {
        this.energiaKj = energiaKj;
    }

    public String getProteina() {
        return proteina;
    }

    public void setProteina(String proteina) {
        this.proteina = proteina;
    }

    public String getLipideos() {
        return lipideos;
    }

    public void setLipideos(String lipideos) {
        this.lipideos = lipideos;
    }

    public String getColesterol() {
        return colesterol;
    }

    public void setColesterol(String colesterol) {
        this.colesterol = colesterol;
    }

    public String getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(String carboidrato) {
        this.carboidrato = carboidrato;
    }

    public String getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(String fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public String getCinzas() {
        return cinzas;
    }

    public void setCinzas(String cinzas) {
        this.cinzas = cinzas;
    }

    public String getCalcio() {
        return calcio;
    }

    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public String getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(String magnesio) {
        this.magnesio = magnesio;
    }

    public String getManganes() {
        return manganes;
    }

    public void setManganes(String manganes) {
        this.manganes = manganes;
    }

    public String getFosforo() {
        return fosforo;
    }

    public void setFosforo(String fosforo) {
        this.fosforo = fosforo;
    }

    public String getFerro() {
        return ferro;
    }

    public void setFerro(String ferro) {
        this.ferro = ferro;
    }

    public String getSodio() {
        return sodio;
    }

    public void setSodio(String sodio) {
        this.sodio = sodio;
    }

    public String getPotassio() {
        return potassio;
    }

    public void setPotassio(String potassio) {
        this.potassio = potassio;
    }

    public String getCobre() {
        return cobre;
    }

    public void setCobre(String cobre) {
        this.cobre = cobre;
    }

    public String getZinco() {
        return zinco;
    }

    public void setZinco(String zinco) {
        this.zinco = zinco;
    }

    public String getRetinol() {
        return retinol;
    }

    public void setRetinol(String retinol) {
        this.retinol = retinol;
    }

    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    public String getRae() {
        return rae;
    }

    public void setRae(String rae) {
        this.rae = rae;
    }

    public String getTiamina() {
        return tiamina;
    }

    public void setTiamina(String tiamina) {
        this.tiamina = tiamina;
    }

    public String getRiboflavina() {
        return riboflavina;
    }

    public void setRiboflavina(String riboflavina) {
        this.riboflavina = riboflavina;
    }

    public String getPiridoxina() {
        return piridoxina;
    }

    public void setPiridoxina(String piridoxina) {
        this.piridoxina = piridoxina;
    }

    public String getNiacina() {
        return niacina;
    }

    public void setNiacina(String niacina) {
        this.niacina = niacina;
    }

    public String getVitaminac() {
        return vitaminac;
    }

    public void setVitaminac(String vitaminac) {
        this.vitaminac = vitaminac;
    }

    public ComposicaoAlimento soma(List<Ingredientes> ingredientes, List<Double> perCapitaLiquido){

        List<ComposicaoAlimento> composicaoAlimentos = ingredientes.stream()
                .map(i -> new ComposicaoAlimento(i.getComposicaoAlimento())).toList();

        List<ComposicaoAlimento> finalComposicaoAlimentos = composicaoAlimentos;

        composicaoAlimentos = IntStream.range(0, composicaoAlimentos.size())
                .mapToObj( i -> multiplicarPorPerCapitaLiquida(finalComposicaoAlimentos.get(i), perCapitaLiquido.get(i))).toList();

        return composicaoAlimentos.stream()
                .reduce(new ComposicaoAlimento(), (acumulador, atual) -> {
                    acumulador.setEnergiaKcal(Double.toString(Double.parseDouble(acumulador.energiaKcal == null? "0" : acumulador.getEnergiaKcal().replace("," , ".")) + Double.parseDouble(atual.getEnergiaKcal().replace("," , "."))));
                    acumulador.setEnergiaKj(Double.toString(Double.parseDouble(acumulador.energiaKj == null ? "0" : acumulador.getEnergiaKj().replace("," , ".")) + Double.parseDouble(atual.getEnergiaKj().replace("," , "."))));
                    acumulador.setProteina(Double.toString(Double.parseDouble(acumulador.proteina == null ? "0" : acumulador.getProteina().replace("," , ".")) + Double.parseDouble(atual.getProteina().replace("," , "."))));
                    acumulador.setLipideos(Double.toString(Double.parseDouble(acumulador.lipideos == null ? "0" : acumulador.getLipideos().replace("," , ".")) + Double.parseDouble(atual.getLipideos().replace("," , "."))));
                    acumulador.setColesterol(Double.toString(Double.parseDouble(acumulador.colesterol == null ? "0" : acumulador.getColesterol().replace("," , ".")) + Double.parseDouble(atual.getColesterol().replace("," , "."))));
                    acumulador.setCarboidrato(Double.toString(Double.parseDouble(acumulador.carboidrato == null ? "0" : acumulador.getCarboidrato().replace("," , ".")) + Double.parseDouble(atual.getCarboidrato().replace("," , "."))));
                    acumulador.setFibraAlimentar(Double.toString(Double.parseDouble(acumulador.fibraAlimentar == null ? "0" : acumulador.getFibraAlimentar().replace("," , ".")) + Double.parseDouble(atual.getFibraAlimentar().replace("," , "."))));
                    acumulador.setCinzas(Double.toString(Double.parseDouble(acumulador.cinzas == null ? "0" : acumulador.getCinzas().replace("," , ".")) + Double.parseDouble(atual.getCinzas().replace("," , "."))));
                    acumulador.setCalcio(Double.toString(Double.parseDouble(acumulador.calcio == null ? "0" : acumulador.getCalcio().replace("," , ".")) + Double.parseDouble(atual.getCalcio().replace("," , "."))));
                    acumulador.setMagnesio(Double.toString(Double.parseDouble(acumulador.magnesio == null ? "0" : acumulador.getMagnesio().replace("," , ".")) + Double.parseDouble(atual.getMagnesio().replace("," , "."))));
                    acumulador.setManganes(Double.toString(Double.parseDouble(acumulador.manganes == null ? "0" : acumulador.getManganes().replace("," , ".")) + Double.parseDouble(atual.getManganes().replace("," , "."))));
                    acumulador.setFosforo(Double.toString(Double.parseDouble(acumulador.fosforo == null ? "0" : acumulador.getFosforo().replace("," , ".")) + Double.parseDouble(atual.getFosforo().replace("," , "."))));
                    acumulador.setFerro(Double.toString(Double.parseDouble(acumulador.ferro == null ? "0" : acumulador.getFerro().replace("," , ".")) + Double.parseDouble(atual.getFerro().replace("," , "."))));
                    acumulador.setSodio(Double.toString(Double.parseDouble(acumulador.sodio == null ? "0" : acumulador.getSodio().replace("," , ".")) + Double.parseDouble(atual.getSodio().replace("," , "."))));
                    acumulador.setPotassio(Double.toString(Double.parseDouble(acumulador.potassio == null ? "0" : acumulador.getPotassio().replace("," , ".")) + Double.parseDouble(atual.getPotassio().replace("," , "."))));
                    acumulador.setCobre(Double.toString(Double.parseDouble(acumulador.cobre == null ? "0" : acumulador.getCobre().replace("," , ".")) + Double.parseDouble(atual.getCobre().replace("," , "."))));
                    acumulador.setZinco(Double.toString(Double.parseDouble(acumulador.zinco == null ? "0" : acumulador.getZinco().replace("," , ".")) + Double.parseDouble(atual.getZinco().replace("," , "."))));
                    acumulador.setRetinol(Double.toString(Double.parseDouble(acumulador.retinol == null ? "0" : acumulador.getRetinol().replace("," , ".")) + Double.parseDouble(atual.getRetinol().replace("," , "."))));
                    acumulador.setRe(Double.toString(Double.parseDouble(acumulador.re == null ? "0" : acumulador.getRe().replace("," , ".")) + Double.parseDouble(atual.getRe().replace("," , "."))));
                    acumulador.setRae(Double.toString(Double.parseDouble(acumulador.rae == null ? "0" : acumulador.getRae().replace("," , ".")) + Double.parseDouble(atual.getRae().replace("," , "."))));
                    acumulador.setTiamina(Double.toString(Double.parseDouble(acumulador.tiamina == null ? "0" : acumulador.getTiamina().replace("," , ".")) + Double.parseDouble(atual.getTiamina().replace("," , "."))));
                    acumulador.setRiboflavina(Double.toString(Double.parseDouble(acumulador.riboflavina == null ? "0" : acumulador.getRiboflavina().replace("," , ".")) + Double.parseDouble(atual.getRiboflavina().replace("," , "."))));
                    acumulador.setPiridoxina(Double.toString(Double.parseDouble(acumulador.piridoxina == null ? "0" : acumulador.getPiridoxina().replace("," , ".")) + Double.parseDouble(atual.getPiridoxina().replace("," , "."))));
                    acumulador.setNiacina(Double.toString(Double.parseDouble(acumulador.niacina == null ? "0" : acumulador.getNiacina().replace("," , ".")) + Double.parseDouble(atual.getNiacina().replace("," , "."))));
                    acumulador.setVitaminac(Double.toString(Double.parseDouble(acumulador.vitaminac == null ? "0" : acumulador.getVitaminac().replace("," , ".")) + Double.parseDouble(atual.getVitaminac().replace("," , "."))));
                    return acumulador;
                });
    }

    public ComposicaoAlimento multiplicarPorPerCapitaLiquida(ComposicaoAlimento composicaoAlimento, double valor) {
        // Multiplica cada propriedade pelo valor recebido como parâmetro

        composicaoAlimento.setEnergiaKj(Double.toString(Double.parseDouble(composicaoAlimento.getEnergiaKj() == null ? "0" : composicaoAlimento.getEnergiaKj().replace("," , "."))*valor));
        composicaoAlimento.setEnergiaKcal(Double.toString(Double.parseDouble(composicaoAlimento.getEnergiaKcal() == null? "0" : composicaoAlimento.getEnergiaKcal().replace("," , "."))*valor));
        composicaoAlimento.setProteina(Double.toString(Double.parseDouble(composicaoAlimento.getProteina() == null ? "0" : composicaoAlimento.getProteina().replace("," , "."))*valor));
        composicaoAlimento.setLipideos(Double.toString(Double.parseDouble(composicaoAlimento.getLipideos() == null ? "0" : composicaoAlimento.getLipideos().replace("," , "."))*valor));
        composicaoAlimento.setColesterol(Double.toString(Double.parseDouble(composicaoAlimento.getColesterol() == null ? "0" : composicaoAlimento.getColesterol().replace("," , "."))*valor));
        composicaoAlimento.setCarboidrato(Double.toString(Double.parseDouble(composicaoAlimento.getCarboidrato() == null ? "0" : composicaoAlimento.getCarboidrato().replace("," , "."))*valor));
        composicaoAlimento.setFibraAlimentar(Double.toString(Double.parseDouble(composicaoAlimento.getFibraAlimentar() == null ? "0" : composicaoAlimento.getFibraAlimentar().replace("," , "."))*valor));
        composicaoAlimento.setCinzas(Double.toString(Double.parseDouble(composicaoAlimento.getCinzas() == null ? "0" : composicaoAlimento.getCinzas().replace("," , "."))*valor));
        composicaoAlimento.setCalcio(Double.toString(Double.parseDouble(composicaoAlimento.getCalcio() == null ? "0" : composicaoAlimento.getCalcio().replace("," , "."))*valor));
        composicaoAlimento.setMagnesio(Double.toString(Double.parseDouble(composicaoAlimento.getMagnesio() == null ? "0" : composicaoAlimento.getMagnesio().replace("," , "."))*valor));
        composicaoAlimento.setManganes(Double.toString(Double.parseDouble(composicaoAlimento.getManganes() == null ? "0" : composicaoAlimento.getManganes().replace("," , "."))*valor));
        composicaoAlimento.setFosforo(Double.toString(Double.parseDouble(composicaoAlimento.getFosforo() == null ? "0" : composicaoAlimento.getFosforo().replace("," , "."))*valor));
        composicaoAlimento.setFerro(Double.toString(Double.parseDouble(composicaoAlimento.getFerro() == null ? "0" : composicaoAlimento.getFerro().replace("," , "."))*valor));
        composicaoAlimento.setSodio(Double.toString(Double.parseDouble(composicaoAlimento.getSodio() == null ? "0" : composicaoAlimento.getSodio().replace("," , "."))*valor));
        composicaoAlimento.setPotassio(Double.toString(Double.parseDouble(composicaoAlimento.getPotassio() == null ? "0" : composicaoAlimento.getPotassio().replace("," , "."))*valor));
        composicaoAlimento.setCobre(Double.toString(Double.parseDouble(composicaoAlimento.getCobre() == null ? "0" : composicaoAlimento.getCobre().replace("," , "."))*valor));
        composicaoAlimento.setZinco(Double.toString(Double.parseDouble(composicaoAlimento.getZinco() == null ? "0" : composicaoAlimento.getZinco().replace("," , "."))*valor));
        composicaoAlimento.setRetinol(Double.toString(Double.parseDouble(composicaoAlimento.getRetinol() == null ? "0" : composicaoAlimento.getRetinol().replace("," , "."))*valor));
        composicaoAlimento.setRe(Double.toString(Double.parseDouble(composicaoAlimento.getRe() == null ? "0" : composicaoAlimento.getRe().replace("," , "."))*valor));
        composicaoAlimento.setRae(Double.toString(Double.parseDouble(composicaoAlimento.getRae() == null ? "0" : composicaoAlimento.getRae().replace("," , "."))*valor));
        composicaoAlimento.setTiamina(Double.toString(Double.parseDouble(composicaoAlimento.getTiamina() == null ? "0" : composicaoAlimento.getTiamina().replace("," , "."))*valor));
        composicaoAlimento.setRiboflavina(Double.toString(Double.parseDouble(composicaoAlimento.getRiboflavina() == null ? "0" : composicaoAlimento.getRiboflavina().replace("," , "."))*valor));
        composicaoAlimento.setPiridoxina(Double.toString(Double.parseDouble(composicaoAlimento.getPiridoxina() == null ? "0" : composicaoAlimento.getPiridoxina().replace("," , "."))*valor));
        composicaoAlimento.setNiacina(Double.toString(Double.parseDouble(composicaoAlimento.getNiacina() == null ? "0" : composicaoAlimento.getNiacina().replace("," , "."))*valor));
        composicaoAlimento.setVitaminac(Double.toString(Double.parseDouble(composicaoAlimento.getVitaminac() == null ? "0" : composicaoAlimento.getVitaminac().replace("," , "."))*valor));

        return composicaoAlimento;
    }

}
