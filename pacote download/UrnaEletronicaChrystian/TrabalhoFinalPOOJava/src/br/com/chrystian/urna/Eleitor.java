/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.chrystian.urna;

/**
 *
 * @author chrystian
 */
public class Eleitor extends Pessoa {

    private String tituloDeEleitor;
    private int identidade;

    public Eleitor() {

    }

    public Eleitor(String tituloDeEleitor, int identidade) {
        this.tituloDeEleitor = tituloDeEleitor;
        this.identidade = identidade;
    }

    public String getTituloDeEleitor() {
        return tituloDeEleitor;
    }

    public void setTituloDeEleitor(String tituloDeEleitor) {
        this.tituloDeEleitor = tituloDeEleitor;
    }

    public int getIdentidade() {
        return identidade;
    }

    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    @Override
    public String toString() {
        return "\ntituloDeEleitor: " + tituloDeEleitor + " \nidentidade: " + identidade;
    }

}
