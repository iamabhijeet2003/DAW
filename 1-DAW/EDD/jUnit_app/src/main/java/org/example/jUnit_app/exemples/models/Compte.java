package org.example.jUnit_app.exemples.models;

import org.example.excepcions.saldoNegatiu;

import java.math.BigDecimal;

public class Compte {
    private String numero;
    private String persona;
    private BigDecimal saldo;

    private Banc banc;


    public Compte(String numero, String persona, BigDecimal saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.persona = persona;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }


    public Banc getBanc() {
        return banc;
    }

    public void setBanc(Banc banc) {
        this.banc = banc;
    }

    public void carrec(BigDecimal valor){
        BigDecimal saldoAux = this.saldo.subtract(valor);
        if (saldoAux.compareTo(BigDecimal.ZERO)<0){
            throw new saldoNegatiu("Saldo Negatiu");
        }
        this.saldo = saldoAux;

    }

    public void abonament(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Compte)){
            return false;
        }
        Compte c = (Compte) obj;
        if (this.persona == null || this.saldo == null)
            return false;


        return this.persona.equals(c.getPersona()) && this.saldo.equals(c.getSaldo());
        //return super.equals(obj);
    }
}
