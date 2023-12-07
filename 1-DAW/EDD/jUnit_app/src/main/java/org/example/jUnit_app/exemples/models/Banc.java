package org.example.jUnit_app.exemples.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Banc {

    private String nom;


    private List<Compte> llistat_Comptes;


    public Banc( ) {
        llistat_Comptes= new ArrayList<>();
    }

    public List<Compte> getLlistat_Comptes() {
        return llistat_Comptes;
    }

    public void setLlistat_Comptes(List<Compte> llistat_Comptes) {
        this.llistat_Comptes = llistat_Comptes;
    }

    public void setCompte_llista(Compte compte){
        this.llistat_Comptes.add(compte);
        compte.setBanc(this);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void transferir(Compte origen, Compte desti, BigDecimal quantitat){
        origen.carrec(quantitat);
        desti.abonament(quantitat);
    }
}
