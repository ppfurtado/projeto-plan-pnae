package com.ppfurtado.hibernatetutorial.domain.model;

import jakarta.persistence.*;

@Entity(name = "amino_acids")
public class AminoAcidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ingredientes ingredientesID;

    @Column(name = "tryptophan")
    private double triptofano;
    @Column(name = "threonine")
    private double treonina;
    @Column(name = "isoleucine")
    private double isoleucina;
    @Column(name = "leucine")
    private double leucina;
    @Column(name = "lysine")
    private double lisina;
    @Column(name = "methionine")
    private double metionina;
    @Column(name = "cystine")
    private double cistina;
    @Column(name = "phenylalanine")
    private double fenilalanina;
    @Column(name = "tyrosine")
    private double tirosina;
    @Column(name = "valine")
    private double valina;
    @Column(name = "arginine")
    private double arginina;
    @Column(name = "histidine")
    private double histidina;
    @Column(name = "alanine")
    private double alanina;
    @Column(name = "asparticAcid")
    private double Acidoaspártico;
    @Column(name = "glutamicAcid")
    private double Acidoglutâmico;
    @Column(name = "glycine")
    private double glicina;
    @Column(name = "proline")
    private double prolina;
    @Column(name = "serine")
    private double serina;

    public AminoAcidos() {
    }

    public AminoAcidos(Long id, Ingredientes ingredientesID, double triptofano, double treonina, double isoleucina, double leucina, double lisina, double metionina, double cistina, double fenilalanina, double tirosina, double valina, double arginina, double histidina, double alanina, double acidoaspártico, double acidoglutâmico, double glicina, double prolina, double serina) {
        this.id = id;
        this.ingredientesID = ingredientesID;
        this.triptofano = triptofano;
        this.treonina = treonina;
        this.isoleucina = isoleucina;
        this.leucina = leucina;
        this.lisina = lisina;
        this.metionina = metionina;
        this.cistina = cistina;
        this.fenilalanina = fenilalanina;
        this.tirosina = tirosina;
        this.valina = valina;
        this.arginina = arginina;
        this.histidina = histidina;
        this.alanina = alanina;
        Acidoaspártico = acidoaspártico;
        Acidoglutâmico = acidoglutâmico;
        this.glicina = glicina;
        this.prolina = prolina;
        this.serina = serina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ingredientes getIngredientesID() {
        return ingredientesID;
    }

    public void setIngredientesID(Ingredientes ingredientesID) {
        this.ingredientesID = ingredientesID;
    }

    public double getTriptofano() {
        return triptofano;
    }

    public void setTriptofano(double triptofano) {
        this.triptofano = triptofano;
    }

    public double getTreonina() {
        return treonina;
    }

    public void setTreonina(double treonina) {
        this.treonina = treonina;
    }

    public double getIsoleucina() {
        return isoleucina;
    }

    public void setIsoleucina(double isoleucina) {
        this.isoleucina = isoleucina;
    }

    public double getLeucina() {
        return leucina;
    }

    public void setLeucina(double leucina) {
        this.leucina = leucina;
    }

    public double getLisina() {
        return lisina;
    }

    public void setLisina(double lisina) {
        this.lisina = lisina;
    }

    public double getMetionina() {
        return metionina;
    }

    public void setMetionina(double metionina) {
        this.metionina = metionina;
    }

    public double getCistina() {
        return cistina;
    }

    public void setCistina(double cistina) {
        this.cistina = cistina;
    }

    public double getFenilalanina() {
        return fenilalanina;
    }

    public void setFenilalanina(double fenilalanina) {
        this.fenilalanina = fenilalanina;
    }

    public double getTirosina() {
        return tirosina;
    }

    public void setTirosina(double tirosina) {
        this.tirosina = tirosina;
    }

    public double getValina() {
        return valina;
    }

    public void setValina(double valina) {
        this.valina = valina;
    }

    public double getArginina() {
        return arginina;
    }

    public void setArginina(double arginina) {
        this.arginina = arginina;
    }

    public double getHistidina() {
        return histidina;
    }

    public void setHistidina(double histidina) {
        this.histidina = histidina;
    }

    public double getAlanina() {
        return alanina;
    }

    public void setAlanina(double alanina) {
        this.alanina = alanina;
    }

    public double getAcidoaspártico() {
        return Acidoaspártico;
    }

    public void setAcidoaspártico(double acidoaspártico) {
        Acidoaspártico = acidoaspártico;
    }

    public double getAcidoglutâmico() {
        return Acidoglutâmico;
    }

    public void setAcidoglutâmico(double acidoglutâmico) {
        Acidoglutâmico = acidoglutâmico;
    }

    public double getGlicina() {
        return glicina;
    }

    public void setGlicina(double glicina) {
        this.glicina = glicina;
    }

    public double getProlina() {
        return prolina;
    }

    public void setProlina(double prolina) {
        this.prolina = prolina;
    }

    public double getSerina() {
        return serina;
    }

    public void setSerina(double serina) {
        this.serina = serina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AminoAcidos that = (AminoAcidos) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
