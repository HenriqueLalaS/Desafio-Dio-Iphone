package iphone.main;

import iphone.apps.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("teste de funcionalidades");

        iphone.escolherMusica("Sabaton - Bismarck");
        iphone.pausar();
        iphone.tocar();
        

        iphone.ligar("xxxxxxxxxxx");
        iphone.atender();
        iphone.acessarCorreioDeVoz();

        iphone.exbirPagina("dio.me");
        iphone.atualizarPagina();
        iphone.fecharPagina("dio.me");
        iphone.adicionarNovaAba();
    }
}
