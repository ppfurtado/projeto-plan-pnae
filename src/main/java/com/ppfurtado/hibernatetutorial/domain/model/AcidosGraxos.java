package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fatty_acids", schema = "planpnae")
public class AcidosGraxos {

    @Id
    @JoinColumn(name = "foodId")
    @OneToOne
    private Ingredientes ingredientes;
    @Column(name = "saturated")
    private double Saturados;
    @Column(name = "monounsaturated")
    private double Monoinsaturados;
    @Column(name = "polyunsaturated")
    private double Poliinsaturados;
    @Column(name = "12:0")
    private double dozeZero;
    @Column(name = "14:0")
    private double quatorzeZero;
    @Column(name = "14:1")
    private double quatorzeUm;
    @Column(name = "16:0")
    private double dezesseisZero;
    @Column(name = "16:1")
    private double dezesseisUm;
    @Column(name = "18:0")
    private double dezoitoZero;
    @Column(name = "18:1")
    private double dezoitoUm;
    @Column(name = "18:1t")
    private double dezoitoUmT;
    @Column(name = "18:2n6")
    private double dezoitoDoisN6;
    @Column(name = "18:2t")
    private double dezoitoDoisT;
    @Column(name = "18:3n3")
    private double dezoitoTrêsN3;
    @Column(name = "20:0")
    private double vinteZero;
    @Column(name = "20:1")
    private double vinteUm;
    @Column(name = "20:4")
    private double vinteQuatro;
    @Column(name = "20:5")
    private double vinteCinco;
    @Column(name = "22:0")
    private double vinteDoisZero;
    @Column(name = "22:5")
    private double vinteDoisCinco;
    @Column(name = "22:6")
    private double vinteDoisSeis;
    @Column(name = "24:0")
    private double vinteQuatroZero;

    public AcidosGraxos() {
    }

    public AcidosGraxos(Ingredientes ingredientes, double saturados, double monoinsaturados, double poliinsaturados, double dozeZero, double quatorzeZero, double quatorzeUm, double dezesseisZero, double dezesseisUm, double dezoitoZero, double dezoitoUm, double dezoitoUmT, double dezoitoDoisN6, double dezoitoDoisT, double dezoitoTrêsN3, double vinteZero, double vinteUm, double vinteQuatro, double vinteCinco, double vinteDoisZero, double vinteDoisCinco, double vinteDoisSeis, double vinteQuatroZero) {
        this.ingredientes = ingredientes;
        Saturados = saturados;
        Monoinsaturados = monoinsaturados;
        Poliinsaturados = poliinsaturados;
        this.dozeZero = dozeZero;
        this.quatorzeZero = quatorzeZero;
        this.quatorzeUm = quatorzeUm;
        this.dezesseisZero = dezesseisZero;
        this.dezesseisUm = dezesseisUm;
        this.dezoitoZero = dezoitoZero;
        this.dezoitoUm = dezoitoUm;
        this.dezoitoUmT = dezoitoUmT;
        this.dezoitoDoisN6 = dezoitoDoisN6;
        this.dezoitoDoisT = dezoitoDoisT;
        this.dezoitoTrêsN3 = dezoitoTrêsN3;
        this.vinteZero = vinteZero;
        this.vinteUm = vinteUm;
        this.vinteQuatro = vinteQuatro;
        this.vinteCinco = vinteCinco;
        this.vinteDoisZero = vinteDoisZero;
        this.vinteDoisCinco = vinteDoisCinco;
        this.vinteDoisSeis = vinteDoisSeis;
        this.vinteQuatroZero = vinteQuatroZero;
    }

    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getSaturados() {
        return Saturados;
    }

    public void setSaturados(double saturados) {
        Saturados = saturados;
    }

    public double getMonoinsaturados() {
        return Monoinsaturados;
    }

    public void setMonoinsaturados(double monoinsaturados) {
        Monoinsaturados = monoinsaturados;
    }

    public double getPoliinsaturados() {
        return Poliinsaturados;
    }

    public void setPoliinsaturados(double poliinsaturados) {
        Poliinsaturados = poliinsaturados;
    }

    public double getDozeZero() {
        return dozeZero;
    }

    public void setDozeZero(double dozeZero) {
        this.dozeZero = dozeZero;
    }

    public double getQuatorzeZero() {
        return quatorzeZero;
    }

    public void setQuatorzeZero(double quatorzeZero) {
        this.quatorzeZero = quatorzeZero;
    }

    public double getQuatorzeUm() {
        return quatorzeUm;
    }

    public void setQuatorzeUm(double quatorzeUm) {
        this.quatorzeUm = quatorzeUm;
    }

    public double getDezesseisZero() {
        return dezesseisZero;
    }

    public void setDezesseisZero(double dezesseisZero) {
        this.dezesseisZero = dezesseisZero;
    }

    public double getDezesseisUm() {
        return dezesseisUm;
    }

    public void setDezesseisUm(double dezesseisUm) {
        this.dezesseisUm = dezesseisUm;
    }

    public double getDezoitoZero() {
        return dezoitoZero;
    }

    public void setDezoitoZero(double dezoitoZero) {
        this.dezoitoZero = dezoitoZero;
    }

    public double getDezoitoUm() {
        return dezoitoUm;
    }

    public void setDezoitoUm(double dezoitoUm) {
        this.dezoitoUm = dezoitoUm;
    }

    public double getDezoitoUmT() {
        return dezoitoUmT;
    }

    public void setDezoitoUmT(double dezoitoUmT) {
        this.dezoitoUmT = dezoitoUmT;
    }

    public double getDezoitoDoisN6() {
        return dezoitoDoisN6;
    }

    public void setDezoitoDoisN6(double dezoitoDoisN6) {
        this.dezoitoDoisN6 = dezoitoDoisN6;
    }

    public double getDezoitoDoisT() {
        return dezoitoDoisT;
    }

    public void setDezoitoDoisT(double dezoitoDoisT) {
        this.dezoitoDoisT = dezoitoDoisT;
    }

    public double getDezoitoTrêsN3() {
        return dezoitoTrêsN3;
    }

    public void setDezoitoTrêsN3(double dezoitoTrêsN3) {
        this.dezoitoTrêsN3 = dezoitoTrêsN3;
    }

    public double getVinteZero() {
        return vinteZero;
    }

    public void setVinteZero(double vinteZero) {
        this.vinteZero = vinteZero;
    }

    public double getVinteUm() {
        return vinteUm;
    }

    public void setVinteUm(double vinteUm) {
        this.vinteUm = vinteUm;
    }

    public double getVinteQuatro() {
        return vinteQuatro;
    }

    public void setVinteQuatro(double vinteQuatro) {
        this.vinteQuatro = vinteQuatro;
    }

    public double getVinteCinco() {
        return vinteCinco;
    }

    public void setVinteCinco(double vinteCinco) {
        this.vinteCinco = vinteCinco;
    }

    public double getVinteDoisZero() {
        return vinteDoisZero;
    }

    public void setVinteDoisZero(double vinteDoisZero) {
        this.vinteDoisZero = vinteDoisZero;
    }

    public double getVinteDoisCinco() {
        return vinteDoisCinco;
    }

    public void setVinteDoisCinco(double vinteDoisCinco) {
        this.vinteDoisCinco = vinteDoisCinco;
    }

    public double getVinteDoisSeis() {
        return vinteDoisSeis;
    }

    public void setVinteDoisSeis(double vinteDoisSeis) {
        this.vinteDoisSeis = vinteDoisSeis;
    }

    public double getVinteQuatroZero() {
        return vinteQuatroZero;
    }

    public void setVinteQuatroZero(double vinteQuatroZero) {
        this.vinteQuatroZero = vinteQuatroZero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AcidosGraxos that = (AcidosGraxos) o;

        return ingredientes.equals(that.ingredientes);
    }

    @Override
    public int hashCode() {
        return ingredientes.hashCode();
    }
}
