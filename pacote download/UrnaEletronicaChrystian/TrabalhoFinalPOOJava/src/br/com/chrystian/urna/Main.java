/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.chrystian.urna;

import java.util.Date;

/**
 *
 * @author chrystian
 */
public class Main {

    public static void main(String[] args) {

        Candidato candidato1 = new Candidato();
        candidato1.setNome("Goku");
        candidato1.setTelefone("48978563235");
        candidato1.setNaturalidade("Brasileiro");
        candidato1.setSiglaDoPartido("GK");
        candidato1.setNumeroDoPartido(1);
        candidato1.setIdade(43);
        candidato1.setEndereço("Avenida Paulista");

        Candidato candidato2 = new Candidato();
        candidato2.setNome("Vegeta");
        candidato2.setTelefone("48843947123");
        candidato2.setNaturalidade("Brasileiro");
        candidato2.setSiglaDoPartido("VG");
        candidato2.setNumeroDoPartido(2);
        candidato2.setIdade(55);
        candidato2.setEndereço("Avenida Desembargador Moreira");

        Candidato candidato3 = new Candidato();
        candidato3.setNome("Majin Boo");
        candidato3.setTelefone("48995835210");
        candidato3.setNaturalidade("Brasileiro");
        candidato3.setSiglaDoPartido("MB");
        candidato3.setNumeroDoPartido(3);
        candidato3.setIdade(48);
        candidato3.setEndereço("Rua Maria Luísa do Val Penteado");

        Candidato candidato4 = new Candidato();
        candidato4.setNome("Kuririn");
        candidato4.setTelefone("48984002360");
        candidato4.setNaturalidade("Brasileiro");
        candidato4.setSiglaDoPartido("KR");
        candidato4.setNumeroDoPartido(4);
        candidato4.setIdade(40);
        candidato4.setEndereço("Rua Domingos Olímpio");

        Eleitor eleitor1 = new Eleitor("56498415", 154547845);
        Eleitor eleitor2 = new Eleitor("123345", 12646985);
        Eleitor eleitor3 = new Eleitor("854796", 14572369);
        Eleitor eleitor4 = new Eleitor("19864784", 897984544);
        Eleitor eleitor5 = new Eleitor("671888198", 14868977);
        Eleitor eleitor6 = new Eleitor("07491454", 879411560);
        Eleitor eleitor7 = new Eleitor("65561187", 87975446);
        Eleitor eleitor8 = new Eleitor("012187854", 1544214);
        Eleitor eleitor9 = new Eleitor("010489915", 784622);
        Eleitor eleitor10 = new Eleitor("470185464", 00325411);
        Eleitor eleitor11 = new Eleitor("65654894", 165412);

        UrnaEletronica urnaEletronica = new UrnaEletronica(1238, 273);
        urnaEletronica.apresentacao();

        Voto voto1 = new Voto(new Date(), eleitor1, candidato1);
        Voto voto2 = new Voto(new Date(), eleitor2, candidato1);
        Voto voto3 = new Voto(new Date(), eleitor3, candidato3);
        Voto voto4 = new Voto(new Date(), eleitor4, candidato3);
        Voto voto5 = new Voto(new Date(), eleitor5, candidato3);
        Voto voto6 = new Voto(new Date(), eleitor6, candidato2);
        Voto voto7 = new Voto(new Date(), eleitor7, candidato4);
        Voto voto8 = new Voto(new Date(), eleitor8, candidato4);
        Voto voto9 = new Voto(new Date(), eleitor9, candidato1);
        Voto voto10 = new Voto(new Date(), eleitor10, candidato1);
        Voto voto11 = new Voto(new Date(), eleitor11, candidato1);

        urnaEletronica.adicionarVoto(voto1);
        urnaEletronica.adicionarVoto(voto2);
        urnaEletronica.adicionarVoto(voto3);
        urnaEletronica.adicionarVoto(voto4);
        urnaEletronica.adicionarVoto(voto5);
        urnaEletronica.adicionarVoto(voto6);
        urnaEletronica.adicionarVoto(voto7);
        urnaEletronica.adicionarVoto(voto8);
        urnaEletronica.adicionarVoto(voto9);
        urnaEletronica.adicionarVoto(voto10);
        urnaEletronica.adicionarVoto(voto11);

        urnaEletronica.exibirQtdVotos();
        urnaEletronica.maisDetalhes();
        urnaEletronica.votoPorCandidato(candidato1);
        urnaEletronica.votoPorCandidato(candidato2);
        urnaEletronica.votoPorCandidato(candidato3);
        urnaEletronica.votoPorCandidato(candidato4);

        System.out.println("                                                                                                                                 ");
        System.out.println("Parabéns ao vencedor ;) ");

    }
}
