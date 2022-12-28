/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.chrystian.urna;

/**
 *
 * @author chrystian
 */
public class Candidato extends Pessoa {

    private String siglaDoPartido;
    private int numeroDoPartido;

    public Candidato() {
    }

    public Candidato(String siglaDoPartido, int numeroDoPartido) {
        this.siglaDoPartido = siglaDoPartido;
        this.numeroDoPartido = numeroDoPartido;
    }

    public String getSiglaDoPartido() {
        return siglaDoPartido;
    }

    public void setSiglaDoPartido(String siglaDoPartido) {
        this.siglaDoPartido = siglaDoPartido;
    }

    public int getNumeroDoPartido() {
        return numeroDoPartido;
    }

    public void setNumeroDoPartido(int numeroDoPartido) {
        this.numeroDoPartido = numeroDoPartido;
    }

    @Override
    public String toString() {
        return "\nsiglaDoPartido: " + siglaDoPartido + "\n numeroDoPartido: " + numeroDoPartido;
    }
}
