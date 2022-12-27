/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.chrystian.urna;

/**
 *
 * @author chrystian
 */
public abstract class Pessoa {

    private String nome;
    private String endereço;
    private String naturalidade;
    private String telefone;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereço, String naturalidade, String telefone, int idade) {
        this.nome = nome;
        this.endereço = endereço;
        this.naturalidade = naturalidade;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa " + "\nnome : " + nome + "\n endereco: " + endereço + " \nnaturalidade: " + naturalidade + "\n telefone=" + telefone + "\n idade: " + idade;
    }

}
