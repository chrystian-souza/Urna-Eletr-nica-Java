/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.chrystian.urna;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chrystian
 */
public class UrnaEletronica {

    private int secaoEleitoral;
    private int zonaEleitoral;
    private List<Voto> votos = new ArrayList<>();

    public UrnaEletronica(int secaoEleitoral, int zonaEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
        this.zonaEleitoral = zonaEleitoral;
    }

    public void apresentacao() {
        System.out.println("                                               URNA ELETRÔNICA                                                     ");
        System.out.println("                                                                                                                                 ");
        System.out.println("Nesta Urna, estão cadastrados 4 candidatos.");
        System.out.println("Vote consciente!");
        System.out.println("                                                                                                                                 ");

    }

    public void adicionarVoto(Voto voto) {

        if (votos.size() < 10) {
            votos.add(voto);
        } else {
            System.err.println("VOTAÇÃO ENCERRADA");
        }

    }

    public void exibirQtdVotos() {
        System.out.println("Total de votos: " + votos.size());
        System.out.println("                                                                                                                                ");
    }

    public int votoPorCandidato(Candidato canditato) {

        int qtd = 0;

        for (Voto v : votos) {
            if (v.getCandidato().equals(canditato)) {
                qtd++;
            }
        }
        System.out.printf("%s - %d voto(s)%n", canditato.getNome(), qtd);
        return qtd;
    }

    public void maisDetalhes() {

        System.out.println("MAIS DETALHES DO CANDIDATO: ");

        System.out.println("----------------------------------------------------------------------------------------------------------");
        int n = 1;
        for (Voto v : votos) {

            System.out.println("                                                                                                        " + n++);
            System.out.println("Seção Eleitoral: " + UrnaEletronica.this.secaoEleitoral);
            System.out.println("Zona Eleitoral: " + UrnaEletronica.this.zonaEleitoral);
            System.out.println("Endereço: " + v.getCandidato().getEndereço());
            System.out.println("Nome: " + v.getCandidato().getNome());
            System.out.println("Idade: " + v.getCandidato().getIdade());
            System.out.println("Nacionalidade: " + v.getCandidato().getNaturalidade());
            System.out.println("Número do partido: " + v.getCandidato().getNumeroDoPartido());
            System.out.println("Sigla do partido: " + v.getCandidato().getSiglaDoPartido());
            System.out.println("Telefone: " + v.getCandidato().getTelefone());
            System.out.println("Data/hora do voto: " + v.getData());
            System.out.println("----------------------------------------------------------------------------------------------------------");

        }
    }

    public List<Voto> getVotos() {
        return votos;
    }

    public void setVotos(List<Voto> votos) {
        this.votos = votos;
    }

    public int getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(int secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public int getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(int zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    @Override
    public String toString() {
        return "UrnaEletronica: " + "secaoEleitoral: " + secaoEleitoral + ", zonaEleitoral: " + zonaEleitoral + ", votos: " + votos;
    }

}
