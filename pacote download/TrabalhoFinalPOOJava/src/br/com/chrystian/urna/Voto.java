/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.chrystian.urna;

import java.util.Date;

/**
 *
 * @author chrystian
 */
public class Voto {

    private Date data;
    private Eleitor eleitor;
    private Candidato candidato;

    public Voto() {
    }

    public Voto(Date data) {
        this.data = data;
    }

    public Voto(Date data, Candidato candidato) {
        this.data = data;
        this.candidato = candidato;
    }

    public Voto(Date data, Eleitor eleitor, Candidato candidato) {
        this.data = data;
        this.eleitor = eleitor;
        this.candidato = candidato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Eleitor getEleitor() {
        return eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    @Override
    public String toString() {
        return "Voto: " + "\ndata: " + data + "\n candidato: " + candidato;
    }

}
